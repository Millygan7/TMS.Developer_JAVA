public class Main {
}
//Задача№1
//Пройдите по массиву, выведите все элементы в прямом и обратном порядку
//public class Exercize1 {

//}
//public static void main(String[] args) {

//    int[] numbers = {55, 33, 123, 122, 4, 7};
//    System.out.println(Arrays.toString(numbers));
//    reverse(numbers);
//    System.out.println(Arrays.toString(numbers));
//}

//   public static void reverse(int[] source) {
//    for (int i = 0; i < source.length / 2; i++) {
//        var temp = source[i];
//        source[i] = source[source.length - 1 - i];
//        source[source.length - 1 - i] = temp;
//    }
//    System.out.println(Arrays.toString(source));
//}
//Задача№2
//найти минимальное-максимальное количество элементов и вывод в консоль
//public static void main(String[] args) {

//    int numbers[] = {15, 8, 22, 5};
//    int max = numbers[0];
//    int min = numbers[0];
//
//    for (int i = 1; i < numbers.length; i++) {
//        max = Math.max(max, numbers[i]);
//        min = Math.min(min, numbers[i]);
//    }
//    System.out.println(" Max is : " + max);
//    System.out.println(" Min is : " + min);
//}
//Задача№3
//Найти индексы минимального и максимального элементов и вывести в консоль
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    final int size = scanner.nextInt();
//    int[] a = new int[size];
//    for (int i = 0; i < size; i++) {
//        System.out.println("a [i]: ");
//    }
//    int max = a[0];
//    for (int i = 1; i < size; i++) {
//        if (a[i] > max) {
//            max = a[i];
//        }
//
//    }}
//Задача№4
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет.
//public static void main(String[] args) {
//    int[] numbers = {55, 33, 123, 122, 1, 7};
//    int zeroCount = 0;
//    for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] == 0) {
//            zeroCount++;
//        }
//    }
//    System.out.println("Нулевых элементов нету : " + zeroCount);
//}
//Задача№5
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д
//public static void main(String[] args) {
//    int[] numbers = {55, 33, 123, 122, 4, 7};
//
//    for (int i = 0; i < numbers.length/2; i++) {
//        int temp =numbers[i];
//        numbers[i] = numbers[numbers.length -1 - i];
//        numbers[numbers.length -1 - i] = temp;
//
//        System.out.println(Arrays.toString(numbers));
//    }
//}
//Задача№№6
//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).
//public static void main(String[] args) {
//    int[] numbers = {56, 55, 53, 33, 17, 10};
//    boolean hasIncreasingSequence = false;
//    for (int i = 0; i < numbers.length - 1; i++) {
//
//        if (numbers[i] < numbers[i + 1]) {
//            hasIncreasingSequence = true;
//            break;
//        }
//    }
//    if (hasIncreasingSequence){
//        System.out.println("Возрастающая последовательность есть");
//    }else {
//
//        System.out.println("Последовательности нет");
//    }
//
//    System.out.println(Arrays.toString(numbers));
//    System.out.println(Arrays.toString(numbers));
//}