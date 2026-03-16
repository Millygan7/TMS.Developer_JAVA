import static java.lang.Long.sum;

public class Exercize1 {
}
public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[i][j] = (int) (Math.random() * 4);
        }
        System.out.println(Arrays.toString(matrix[i]));
    }
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите элементы массива:");
    int sum = 0;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print("matrix[" + i + "][" + j + "]: ");
            matrix[i][j] = scanner.nextInt();
       }
    }


        // getting sum of array values


        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
            sum += matrix[i][j];

    System.out.println("Сумма элементов массива: " + sum);
    }















