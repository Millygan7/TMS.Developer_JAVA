import java.util.Scanner;

public class Exercize1 {


    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else if (number % 2 != 0) {
            System.out.println("Число нечетное");
        }
    }
}

