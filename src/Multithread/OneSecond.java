package Multithread;

import static java.lang.Thread.sleep;

public class OneSecond {
    public static void main(String[] args) {
        Thread One = new Thread(() -> {
            int count = 0;
            while (true) {
                try {
                    sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
//                System.out.println(count);
            }
        });
        Thread five = new Thread(() -> {
            int count1 = 0;
            while (true){
            try {
                sleep(5000L);
                count1 = count1 + 5;
                System.out.println("прошло секунд: " +count1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        });
        Thread seven = new Thread(() -> {
            int count2 = 0;
            while (true){
                try {
                    sleep(7000L);
                    count2 = count2 + 7;
                    System.out.println("прошло секунд: "+ count2 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        One.start();
        five.start();
        seven.start();
    }
}
