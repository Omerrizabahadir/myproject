package arrays;

import java.util.Arrays;

public class FindLargestAndSmallestNumberWithStreamAPI {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5, 0, -1};

        int max = Arrays.stream(numbers)
                .max().getAsInt();

        int min = Arrays.stream(numbers)
                .min().getAsInt();


        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçüük sayı : " + min);
    }
}
