package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedArray2 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(numbers);
        Collections.reverse(list);

        for (int i = 0; i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}
