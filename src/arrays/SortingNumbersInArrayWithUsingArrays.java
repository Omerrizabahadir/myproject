package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingNumbersInArrayWithUsingArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};

        //küçükten büyüğe sıralama
        Arrays.sort(numbers);    //bu sadece küçükten büyüğe sıralama yapar
        System.out.println("Küçükten büyüğe sıralama : " + Arrays.toString(numbers));
    }
}
