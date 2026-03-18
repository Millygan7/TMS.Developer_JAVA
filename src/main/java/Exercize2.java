public class Exercize2 {
}
public static void main(String[] args) {

    int numbers[] = {15, 8, 22, 5};
    int max = numbers[0];
    int min = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        max = Math.max(max, numbers[i]);
        min = Math.min(min, numbers[i]);
    }
    System.out.println(" Max is : " + max);
    System.out.println(" Min is : " + min);
}
