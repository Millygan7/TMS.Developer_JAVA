public class Exercize5 {



}
public static void main(String[] args) {
    int[] numbers = {55, 33, 123, 122, 4, 7};

    for (int i = 0; i < numbers.length/2; i++) {
        int temp =numbers[i];
        numbers[i] = numbers[numbers.length -1 - i];
        numbers[numbers.length -1 - i] = temp;

        System.out.println(Arrays.toString(numbers));
    }
}
