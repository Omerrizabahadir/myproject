package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    //diziyi Listeye dönüştürüp Collections.reverse() ile ters çevirme
    public  static void reverseArrayWithListCollections(){
        int [] a = {1, 5, 7, 9};

        //Listeya çevirme
        List<Integer> numberList = new ArrayList<>();

        for (int num : a){
            numberList.add(num);
        }
        Collections.reverse(numberList);
        System.out.println(numberList);
    }
    public static void main(String[] args) {

        //döngü ile çeviren metot çağırma
        reverseArrayWithLoop();

        //Listeye çevirip ters çeviren metot çağırma
        reverseArrayWithListCollections();

    }
}
