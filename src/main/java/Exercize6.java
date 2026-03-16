public class Exercize6 {


}
public static void main(String[] args) {
    int[] numbers = {56, 55, 53, 33, 17, 10};
    boolean hasIncreasingSequence = false;
    for (int i = 0; i < numbers.length - 1; i++) {

        if (numbers[i] < numbers[i + 1]) {
            hasIncreasingSequence = true;
            break;
        }
    }
    if (hasIncreasingSequence){
        System.out.println("Возрастающая последовательность есть");
    }else {

        System.out.println("Последовательности нет");
        }

                System.out.println(Arrays.toString(numbers));
        }

