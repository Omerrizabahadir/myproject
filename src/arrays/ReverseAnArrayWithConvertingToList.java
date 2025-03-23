package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayWithConvertingToList {

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
        reverseArrayWithListCollections();
    }
}
