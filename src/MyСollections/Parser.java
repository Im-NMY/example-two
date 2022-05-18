package MyСollections;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

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
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            words.addAll(Arrays.asList(line.split("[^а-яА-Я]+")));
        }
        return words;
    }
    public static void main(String[] args) {
    //Определяем количество вхождений
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("Пример определение количество вхождений:");

        String RegEx = "^[Сс]трада(.*)";

        File file = new File("voyna.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parser(file);
        Pattern pattern = Pattern.compile(RegEx);
        ArrayList<String> Words = new ArrayList<>();

        for (String line : lines) {
            if (pattern.matcher(line).find()) {
                Words.add(line);
            }
        }
        System.out.println("Кол-во слов однокоренных слову - Страдание, входит "+ Words.size()+" раз(а)");

    //Пример таблицы умножения через вложенный цикл:
        System.out.println("----------------------------------------------------------");
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
