

public class Exercize4 {
}
public static void main(String[] args) {
    int[] numbers = {55, 33, 123, 122, 1, 7};
    int zeroCount = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == 0) {
            zeroCount++;
        }
    }
    System.out.println("Нулевых элементов нету : " + zeroCount);
}








