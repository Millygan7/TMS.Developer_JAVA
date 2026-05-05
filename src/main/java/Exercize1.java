import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercize1 {
    private static List<String> word = new ArrayList<>();

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
        public static Map<String, Boolean> checkDuplicates(List<String> array) {
            Map<String, Integer> countMap = new HashMap<>();
            Map<String, Boolean> result = new HashMap<>();

            // Первый проход: подсчёт количества вхождений каждой строки
            for (String str : array) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }

            // Второй проход: формирование результата
            for (String str : countMap.keySet()) {
                result.put(str, countMap.get(str) >= 2);
            }

            return result;
        }
    }
}













