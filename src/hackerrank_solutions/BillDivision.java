package hackerrank_solutions;

import java.util.Arrays;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int n = 0;

        for(int i = 0; i < bill.size();i++){
           n += bill.get(i);
        }
        int billAndAnnaEat = n - bill.get(k);
        int annaShare = billAndAnnaEat / 2;

        if(annaShare == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - annaShare);
        }
    }

    public static void main(String[] args) {
        List<Integer> bill = Arrays.asList(3,10,2,9);
        int k = 1;
        int b = 12;

        bonAppetit(bill,k,b);
    }
}
