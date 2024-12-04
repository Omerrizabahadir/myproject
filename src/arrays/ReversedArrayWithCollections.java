package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedArrayWithCollections {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

     //önce listeye çevirme
        List<Integer> listNumbers = Arrays.asList(numbers);

        //collections ile terse çevirme
        Collections.reverse(listNumbers);

        for (int num : listNumbers){
            System.out.println(num);
        }

        /*
        //döngü ile yazdırma
         for (int i = 0; i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        */
    }
}
