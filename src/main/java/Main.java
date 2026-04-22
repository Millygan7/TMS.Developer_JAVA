/**
 * @author Pleshakov Vladimir
 * @date 20.04.2026
 * @description Class Strings
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.*;

public class Main {


}
//                                      Задание№1
//В задании приложен файл «Ромео и Джульетта» на английском языке, вычитайте его в приложении.
//Проанализировать и записать в другой файл самое длинное слово.

//public static void main(String[] args) {
//
//    Pattern wordPattern = Pattern.compile("\\b[a-zA-Zа-яА-ЯёЁ]+\\b");
//    String longestWord = "";
//    int maxLength = 0;
//    int lineOfLongestWord = 0;
//
//    try (FileReader fr = new FileReader("src/RomeoAndJuliet.txt.txt")) {
//        LineNumberReader lr = new LineNumberReader(fr);
//
//        String s;
//        int lineNumber = 1;
//        while ((s = lr.readLine()) != null) {
//            Matcher matcher = wordPattern.matcher(s);
//            while (matcher.find()) {
//                String currentWord = matcher.group();
//                if (currentWord.length() > maxLength) {
//                    maxLength = currentWord.length();
//                    longestWord = currentWord;
//                    lineOfLongestWord = lineNumber;
//                }
//            }
//            lineNumber++;
//        }
//
//         Вывод результата после обработки всего файла
//        if (!longestWord.isEmpty()) {
//            System.out.println("Самое длинное слово: " + longestWord);
//            System.out.println("Длина: " + maxLength);
//            System.out.println("Строка: " + lineOfLongestWord);
//        } else {
//            System.out.println("Слова не найдены.");
//        }
//    } catch (IOException e) {
//        System.err.println("Ошибка чтения файла: " + e.getMessage());
//        e.printStackTrace();
//    }
//   try (FileWriter fw = new FileWriter( "src/Otherfiletxt." )) {
//       String line = longestWord;
//        fw.write(longestWord);
//        fw.flush() ;
//    } catch (Exception e) {
//        e.printStackTrace() ;
//    }
//}

public static void main(String[] args) throws IOException {
    String[] DocNumbers = {
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O",
            "contractR1S2T3U",
            "docnumM5N6O7P8Q",
            "contractA5B6C7D",
            "docnumX3Y4Z5A6B",
            "contractP2Q3R4S",
            "docnumH7J8K9L0M",
            "contractW4X5Y6Z",
            "docnumK2L3M4N5O",
            "contractR1S2T3U",
            "docnumM5N6O7P8Q",
            "contractA5B6C7D",
            "docnumX123456789",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6@",
            "contractP2Q3R4&",
            "docnumH7J8K9L0*",
            "contractW4X5Y6Z7A8B9C0D&&&",
            "docnumK2L3M4N5O6P7Q8R^@@",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K9L0M1N@@@2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "docnumK2L3M4 N5O6P7Q8R",
            "contractR1S2T-3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C  7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3   R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3  R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K 9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
            "contractX9Y8Z7W6V5U4T3S",
            "docnumK2L3M4N5O6P7Q8R",
            "contractR1S2T3U4V5W6X7Y",
            "docnumM5N6O7P8Q9R0S1T",
            "contractA5B6C7D8E9F0G1H",
            "docnumX3Y4Z5A6B7C8D9E",
            "contractP2Q3R4S5T6U7V8W",
            "docnumH7J8K9L0M1N2O3P",
            "contractW4X5Y6Z7A8B9C0D",
    };
    Pattern wordPattern = Pattern.compile("(docnum|contract)[A-Z@&*0-9]{1,40}");
    try (FileWriter fw = new FileWriter("src/NumbersFile.txt")) {
        for (String doc : DocNumbers) {
            Matcher matcher = wordPattern.matcher(doc);
            if (matcher.find()) {
                fw.write(matcher.group() + "\n");
            }
        }
        System.out.println("Данные записаны в файл src/NumbersFile.txt");
    } catch (IOException e) {
        e.printStackTrace();
    }
    Pattern validPattern = Pattern.compile("^(docnum|contract)[a-zA-Z0-9]{1,15}$");

    try (FileWriter validWriter = new FileWriter("src/validationnumbers.txt");
         FileWriter invalidWriter = new FileWriter("src/invaliddocumentnumbers.txt")) {

        for (String doc : DocNumbers) {
            Matcher matcher = validPattern.matcher(doc);

            if (matcher.matches()) {

                validWriter.write(doc + "\n");
            } else {

                invalidWriter.write(doc + " (содержит спецсимволы/пробелы)\n");
            }
        }
    }
}










