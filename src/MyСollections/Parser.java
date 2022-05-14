package MyСollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    ArrayList<String> parser(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
    //Определяем количество вхождений
        System.out.println();
        System.out.println("Пример определение количество вхождений:");
        System.out.println("----------------------------------------------------------");

        File file = new File("voyna.txt");
        Parser parser = new Parser();

        ArrayList<String> lines = parser.parser(file);

        int count = 0;
        String suffering = "страдание";
        for (String line : lines) {
            if (line.contains(suffering)) {
                count += 1;
            }
        }
        System.out.println("Слово - " + suffering + " , входит " + count + " раз(a).");
        System.out.println("----------------------------------------------------------");

    //Определяем количество вхождений через класс Scanner:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");

        String word = scanner.nextLine();
        int count1 = 0;
        for (String line1 : lines) {
            if (line1.contains(word)) {
                count1 += 1;
            }
        }
        scanner.close();
        System.out.println("Слово - " + word + " , содержится в тексте  " + count1 + " раз(a).");
        System.out.println("----------------------------------------------------------");

    //Пример таблицы умножения через вложенный цикл:
        System.out.println("Таблица умножения:");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("End");
    }
}
