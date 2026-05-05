/**
 * @author Pleshakov Vladimir
 * @date 22.04.2026
 * @description Streams
 */
import java.util.List;
import static java.util.Arrays.*;


public class Exercize1 {


}
//Задача № 1:
//Создать коллекцию класса ArrayList, наполнив ее элементы типа Integer. С помощью
//Стрим'ов:
//        - Удалить дубликаты
//- Оставить только четные элементы
//- Вывести величину оставшихся элементов в стрим

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.addAll(asList(1, 1, 2, 4, 4, -5, -3, 2, 4, 5, 6, 7));
    List<Integer> duplicate = list.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(duplicate);
    List<Integer> sum = Collections.singletonList(list.stream()
            .filter(x -> x % 2 == 0)
            .reduce(0, Integer::sum));
    System.out.println ( " Сумма четных чисел : "+ sum) ;

//   Задача *:
//    Создать набор данных в формате id-имя, сохраненное на карте. Необходимо отобрать из
//    В этом наборе только те данные, идентификатор которых приводится в числовом диапазоне 1/2/5/8/9/13.
//    Среди эффектных результатов отобрать только те, которые имеют нечетное количество
//    буква в имени. После возврата этого списка Список имен, записанных букв назад.
//    Блок 3. Материалы для самостоятельной работы
//    Теоретические вопросы по занятости для самопроверки:
    Map<Integer, String> users = new HashMap<>();
    users.put(1, "Vasiliy");
    users.put(9, "Ekaterina");
    users.put(3, "Vladimir");
    users.put(13, "Natalia");
    users.put(4, "Semen");
    users.put(8, "Elena");
    users.put(5, "Aleksey");
    users.put(6, "Dmytriy");
    users.put(7, "Anna");
    users.put(2, "Aleksandr");


    Pattern numRange = Pattern.compile(("(1|2|5|8|9|13)"));

    Map<Integer, String> rangeNum = users.entrySet().stream()
            .filter(entry -> numRange.matcher(entry.getValue()).matches())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    System.out.println(rangeNum);
    List<String> oddCountNames = users.values().stream()
            .filter(n -> n.length() % 2 ==1)
            .collect(Collectors.toList());

    System.out.println(oddCountNames);
}