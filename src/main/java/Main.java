

public class Main {
}
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    StringBuffer firstString = new StringBuffer();
//    System.out.println("Введите строку :");
//    String userInput = scanner.nextLine();
//    int str = userInput.length();
//    StringBuffer secondString = new StringBuffer();
//    System.out.println("Введите строку : ");
//    secondString.append((scanner.nextLine()));
//    int str2 = secondString.length();
//    StringBuffer thirdString = new StringBuffer();
//    System.out.println("Введите строку : ");
//    thirdString.append((scanner.nextLine()));
//    int str3 = thirdString.length();
//    System.out.println("Длина первой строки : " +firstString.length());
//    System.out.println("Длина второй строки :" + secondString.length());
//    System.out.println("Длина третьей строки :" +thirdString.length());
//    int len1 = firstString.length();
//    int len2 = secondString.length();
//    int len3 = thirdString.length();
//
//    System.out.println("\nРезультат сравнения:");
//    if (len1 >= len2 && len1 >= len3) {
//        System.out.println("Самая длинная строка — первая");
//    } else if (len2 >= len1 && len2 >= len3) {
//        System.out.println("Самая короткая строка — вторая");
//    } else {
//        System.out.println("Самая длинная строка — третья");
//    }





//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String[] strings = new String[3];
//    for (int i = 0; i < 3; i++) {
//        System.out.print("Введите строку " + (i + 1) + ": ");
//        String input = scanner.nextLine().trim();
//        strings[i] = (input != null) ? input : "";
//    }
//    for (int i = 0; i < strings.length; i++)
//        for (int j = 0; j < strings.length; j++)
//
//            if (strings[j].compareTo(strings[j + 1]) > 0) {
//                 Обмен элементов
//                String temp = strings[j];
//                strings[j] = strings[j + 1];
//                strings[j + 1] = temp;
//
//            }
//
//                 Вывод отсортированных строк
//                System.out.println("\nСтроки в порядке возрастания:");
//                for (int i = 0; i < strings.length; i++) {
//                    System.out.println((i + 1) + ": " + strings[i]);
//                }
//
//                scanner.close(); // Закрываем сканер
//
public static void  main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strings = new String[3];
    for (int i = 0; i < 3; i++) {
        System.out.print("Введите строку " + (i + 1) + ": ");
        String input = scanner.nextLine().trim();
        strings[i] = (input != null) ? input : "";
    }
}




















