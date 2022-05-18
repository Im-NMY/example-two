package MyСollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScanParser {
    ArrayList<String> ScanPars(File file){
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)){
            String line = scanner.nextLine();
            while (scanner.hasNextLine()) {
                lines.add(line);
                line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            words.addAll(Arrays.asList(line.split("[^а-яА-Я]+")));
        }
        return words;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Парсер через класс Scanner!");
        System.out.println("----------------------------------------------------------");
        System.out.println("Пример определение количество вхождений:");

        String regEx = "^[Сс]трада(.*)";

        File file = new File("voyna.txt");
        ScanParser ScanPars = new ScanParser();
        ArrayList<String> MyLines = ScanPars.ScanPars(file);
        Pattern pattern = Pattern.compile(regEx);

        ArrayList<String> words = new ArrayList<>();
        for (String myLine : MyLines) {
            if (pattern.matcher(myLine).find()) {
                words.add(myLine);
            }
        }
        System.out.println("Кол-во слов однокоренных слову - Страдание, входит "+ words.size()+" раз(а)");
        System.out.println("----------------------------------------------------------");
        System.out.println("End");
    }
}
