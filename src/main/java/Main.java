
/**
 * @author Plehakov Vladimir
 * @date 13.03.2026
 * @description TwoArrayMassives
 */
//Задача№1
//        1.1 Создайте двумерный массив, заполните его случайными числами.
//        1.2 Добавьте к каждому последовательному числу, который пользователь будет вводить с консоли.
//        1.3 Найти сумму всех полученных элементов и вывести в консоль
//public static void main(String[] args) {
//    int[][] matrix = new int[4][4];
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix.length; j++) {
//            matrix[i][j] = (int) (Math.random() * 4);
//        }
//        System.out.println(Arrays.toString(matrix[i]));
//    }
//    Random random = new Random();
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите элементы массива:");
//    int sum = 0;
//    for (int i = 0; i < 4; i++) {
//        for (int j = 0; j < 4; j++) {
//            System.out.print("matrix[" + i + "][" + j + "]: ");
//            matrix[i][j] = scanner.nextInt();
//        }
//    }
//
//
//     getting sum of array values
//
//
//    for (int i = 0; i < matrix.length; i++)
//        for (int j = 0; j < matrix[i].length; j++)
//            sum += matrix[i][j];
//
//    System.out.println("Сумма элементов массива: " + sum);
//    System.out.println("Сумма элементов массива: " + sum);
//}
//Задача№2
//Создать программу для раскраски шахматной доски с помощью цикла. Создать
//двумерный массив String 8х8. С помощью циклов присваивания элементам значений массива
//B(Черный) или W(Белый). При подведении итогов работы программа должна быть
//teachmeskills.by
//следующим:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//
//public static void main(String[] args) {
//     Создаём двумерный массив String размером 8x8
//    String[][] chessBoard = new String[8][8];
//
//     Заполняем массив значениями B (чёрный) и W (белый) с помощью вложенных циклов
//    for (int i = 0; i < 8; i++) {
//        for (int j = 0; j < 8; j++) {
//             Если сумма индексов строки и столбца чётная — белая клетка (W),
//             если нечётная — чёрная клетка (B)
//            if ((i + j) % 2 == 0) {
//                chessBoard[i][j] = "W";
//            } else {
//                chessBoard[i][j] = "B";
//            }
//        }
//    }
//    System.out.println("Шахматная доска:");
//    for (int i = 0; i < 8; i++) {
//        for (int j = 0; j < 8; j++) {
//            System.out.print(chessBoard[i][j] + " ");
//        }
//        System.out.println("" + "");
//         Переход на новую строку после каждой строки доски
//    }
//}
//}