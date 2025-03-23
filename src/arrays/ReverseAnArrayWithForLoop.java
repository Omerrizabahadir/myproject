package arrays;


import java.util.Arrays;


public class ReverseAnArrayWithForLoop {

    //diziyi döngü ile ters çevirme
    public static void reverseArrayWithLoop(){
        int [] numbers = {10, 20, 30, 40, 50};

        //Orjinal diziyi terse çevirme
        for(int i = 0; i < numbers.length / 2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {

        //döngü ile çeviren metot çağırma
        reverseArrayWithLoop();



    }
}
