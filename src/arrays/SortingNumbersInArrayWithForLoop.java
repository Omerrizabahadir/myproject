package arrays;

import java.util.Arrays;

public class SortingNumbersInArrayWithForLoop {
    public static void main(String[] args) {
        int[] numbers = {90, 12, -1, 0, 23};

        //küçükten büyüğe sıralama
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        System.out.println("Büyükten küçüğe  : " + Arrays.toString(numbers));
        //büyükten küçüğe sıralama
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("En büyükten en küçüğe sıralama : " + Arrays.toString(numbers));
    }
}
