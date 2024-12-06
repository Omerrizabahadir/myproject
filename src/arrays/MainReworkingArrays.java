package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainReworkingArrays {


    private static final int[] numbers = {-1, -10, 0, 13, 45};

    public static int findLargestNumberWithStreamAPI() {

        int largestNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Dizideki en büyük sayı : " + largestNumber);

        return largestNumber;
    }

    public static int findSmallestNumberWithStreamAPI() {


        int smallestNumber = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Dizideki en küçük sayı : " + smallestNumber);

        return smallestNumber;
    }

    public static int findLargestNumberWithLoop() {

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {

            }
        }
        System.out.println("For döngüsü ie Dizinin en büyük sayısı : " + max);
        return max;
    }

    public static int findSmallestNumberWithLoop() {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else {

            }
        }
        System.out.println("For döngüsü ie Dizinin en küçük sayısı : " + min);
        return min;
    }

    public static int findLargestNumberWithNestedLoop() {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] > max) {
                    max = numbers[j];
                }
            }
        }
        System.out.println("Nested loop ile en büyük sayı : " + max);
        return max;
    }

    public static int loopingThroughArrayWithLoop() {
        //döngü ile
        System.out.println("For döngüsü ile diziyi sıralama : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        return 0;
    }

    public static int loopingThroughArrayWithForEach() {
        //for-each ile diğer kullanım
        System.out.println("For - each ile diziyi sıralama : ");
        for (int num : numbers) {
            System.out.println(num);
        }

        return 0;
    }

    public static int sortingArraySmallestToLargestNumberWithWrapperClass() {
        Integer[] numbers = {-23, 45, 0, 3, 100, -90};

        Arrays.sort(numbers);
        System.out.println("Wrapper sınıfı kullanarak Numbers dizisinin en küçükten en büyüğe sıralaması : " + Arrays.toString(numbers));
        return 0;
    }

    public static int sortingArrayLargestToSmallestNumberWithWrapperClass() {
        Integer[] numbers = {-23, 45, 0, 3, 100, -90};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Wrapper sınıfı kullanarak Numbers dizisinin En büyükten en küçüğe sıralama : " + Arrays.toString(numbers));
        return 0;
    }

    public static int reversedArray() {
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("numbers dizisinin ters sıralaması : ");
        for (int num : reversed) {
            System.out.println(num);
        }
        return 0;
    }

    public static int reversedArrayUsingForLoop() {
        System.out.println("numbers dizisini for döngüsü ile tersten sıralama : ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        return 0;
    }
    public static int reversedArrayWihCollectionsClass(){
        Integer[] numbers = {-4,78,-23,67,0};
        List<Integer>list = Arrays.asList(numbers);
        Collections.reverse(list);
        System.out.println("Wrapper sınıfı collections ile dizinin tersten sıralaması : "+list);
        return 0;
    }

    public static void main(String[] args) {
        findLargestNumberWithStreamAPI();
        findSmallestNumberWithStreamAPI();
        findLargestNumberWithLoop();
        findSmallestNumberWithLoop();
        findLargestNumberWithNestedLoop();
        loopingThroughArrayWithLoop();
        loopingThroughArrayWithForEach();
        sortingArrayLargestToSmallestNumberWithWrapperClass();
        sortingArraySmallestToLargestNumberWithWrapperClass();
        reversedArray();
        reversedArrayUsingForLoop();
        reversedArrayUsingForLoop();
        reversedArrayWihCollectionsClass();
    }
}


