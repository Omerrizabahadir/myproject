package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rework {

    private static final int[] numbers = {2, 1, 3, 41, 5};

    public static int findMaxNumberInArray() {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {

            }
        }
        System.out.println("dizideki en büyük sayı : " + max);
        return max;
    }
    public static Integer findMaxNumberWithStreamAPI(){
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("dizideki en büyük sayı stream apı ile :" + max);
        return max;
    }
    public static int sortingArrayWithGivenOrder(){
        System.out.println("Dizinin verişlen düzende sıralaması : ");
        for (int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+", ");
        }
        //for-each ile
        System.out.println("Dizinin verişlen düzende sıralaması for-each ile :");
        for (int num : numbers ){
            System.out.print(num +", ");
        }

        return 0;
    }

    public static int sortingArrayReversedOrder(){

        int[] reversed = new int[numbers.length];

        for (int i = 0 ;i < numbers.length; i++){
           reversed[i] = numbers[numbers.length-1-i];
        }
        System.out.println("verilen arrayin ters sıralaması : "+Arrays.toString(reversed));
        return 0;
    }
    public static int sortingArrayWithCollections(){
        Integer [] numbers = {1,2,3,4,5};

        List<Integer>numberList = Arrays.asList(numbers);
        Collections.sort(numberList);
        System.out.println("Collections ile dizi sıralaması : " + numberList);
        return 0;
    }
    public static int sortingArrayReversedOrderWithCollections(){
        Integer [] numbers = {1,2,3,23,5};

        List<Integer> numberList = Arrays.asList(numbers);

        Collections.reverse(numberList);
        System.out.println("Collections ile dizinin tersten sıralaması : " + numberList);
        return 0;
    }
    public static int sortingArrayLargestToSmallestWithWrapperClass(){
        Integer [] numbers = {1,2,3,23,5};

        Arrays.sort(numbers);
        System.out.println("Wrapper ile küçükten büyüğe sıralama : " + Arrays.toString(numbers));
        return 0;
    }
    public static int sortingSmallestToBiggestWithWrapperClass(){
        Integer [] numbers = {1,2,3,23,5};

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Wrapper ile büyükten küçüğe sıralama : " + Arrays.toString(numbers));
        return 0;
    }
    public static int sortingArrayBiggestToSmallestWithStreamAPI(){
        int[] descending = Arrays.stream(numbers).boxed().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray();
        System.out.println("Stream API ile büyükten küçüğe sıralama : " + Arrays.toString(descending));
        return 0;
    }
    public static int sortingArrayWithFor(){
        System.out.println("dizinin döngü ile küçükten büyüğe sıralaması :");
        for (int i =0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if (numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        return 0;
    }

    public static void main(String[] args) {

        findMaxNumberInArray();
        findMaxNumberWithStreamAPI();
        sortingArrayWithGivenOrder();
        sortingArrayReversedOrder();
        sortingArrayWithCollections();
        sortingArrayReversedOrderWithCollections();
        sortingArrayLargestToSmallestWithWrapperClass();
        sortingSmallestToBiggestWithWrapperClass();
        sortingArrayBiggestToSmallestWithStreamAPI();
        sortingArrayWithFor();
        sortingArrayWithFor();
    }
}
