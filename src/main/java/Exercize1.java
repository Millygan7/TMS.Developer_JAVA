import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Задача № 1:
//На входе создается строка массива, верните Map<String, Boolean>, где каждая отдельная
//строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": ложь, "b": ложь, "c": ложь}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}
public class Exercize1 {
    private static List<String> word = new ArrayList<>();

    ;

    public Exercize1(List<String> word) {
        this.word = word;
    }

    public List<String> getWord() {
        return word;
    }

    public void setWord(List<String> word) {
        this.word = word;
    }

    public static class DuplicateChecker {
        public static boolean checkDuplicates(List<String> array) {
            Map<String, Integer> countMap = new HashMap<>();
            Map<String, Boolean> result = new HashMap<>();


            for (String str : array) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }

            // Второй проход: формирование результата
            for (String str : array) {
                result.put(str, countMap.get(str) >= 2);
            }

            return result;
        }
    }
}













