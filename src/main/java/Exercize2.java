import java.util.Scanner;

public class Exercize2 {


    public static void main(String[] args) {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Worm");
        } else if (temp > -20) {
            System.out.println("Normal");
        }
        if (-20 > temp) {
            System.out.println("Cold");
            System.out.println("Cold");
        }
    }
}