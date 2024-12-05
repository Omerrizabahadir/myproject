package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingAnArrayLargerToSmallerOrSmallerToLargerWithWrapperClass {
    public static void main(String[] args) {
        Integer [] list = {3, 7, 2, 8, 5};

        //büyükten küçüğe sıralama
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralama: " + Arrays.toString(list));


        //küçükten büyüğe sıralama
        Arrays.sort(list);
        System.out.println("Küçüktten büyüğe sıralama : " + Arrays.toString(list));
    }
}
