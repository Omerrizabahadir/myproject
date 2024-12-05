package arrays;

import java.util.Arrays;

public class SortingArrayLargerToSmallerOrSmallerToLargerWithStreamAPI {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};

        //küçükten büyüğe sıralama
        int[] ascending = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> a - b)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Küçükten büyüğe: " + Arrays.toString(ascending));


        //büyükten küçüğe sıralama
        int[] descending = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Büyükten küçüğe: " + Arrays.toString(descending));
    }
}
