import java.util.Arrays;

import static java.util.Collections.reverse;


public class Exercize1 {

}
        public static void main(String[] args) {

            int[] numbers = {55, 33, 123, 122, 4, 7};
            System.out.println(Arrays.toString(numbers));
            reverse(numbers);
            System.out.println(Arrays.toString(numbers));
        }

        public static void reverse(int[] source) {
            for (int i = 0; i < source.length / 2; i++) {
                var temp = source[i];
                source[i] = source[source.length - 1 - i];
                source[source.length - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(source));
        }
    


