package arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {9, 12, 6, 0, -12, 90};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralama : "+Arrays.toString(numbers));

        for (int i =0 ; i< numbers.length;i++){
            for (int j =0;j< numbers.length;j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("büyükten küçüğe sıralama : "+Arrays.toString(numbers));

        int max = Arrays.stream(numbers)
                .max().getAsInt();
        System.out.println(max);

        int min = Arrays.stream(numbers)
                .min().getAsInt();
        System.out.println(min);
    }
}
