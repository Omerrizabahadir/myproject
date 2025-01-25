package hackerrank_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets2 {

    public static int getTotalX(List<Integer> a, List <Integer>b){
        int start = a.stream().max(Integer::compare).orElse(0);
        int end = b.stream().min(Integer::compare).orElse(0);
        int count = 0;

            List<Integer> validNumbers = new ArrayList<>();

        for(int x = start; x <= end;x++){
            int finalX = x;
            boolean isXDivideAllAValue = a.stream().allMatch(num -> finalX % num == 0);
            boolean isXDividedAllBValue = b.stream().allMatch(num -> num % finalX == 0);

            if (isXDivideAllAValue && isXDividedAllBValue){
                count++;
                validNumbers.add(x);
            }
        }

        System.out.println("Valid Numbers are : " + validNumbers);
        return count;
    }

    public static void main(String[] args) {


        List<Integer> a = Arrays.asList(2,4);
        List<Integer> b = Arrays.asList(16,32,96);

        int validNumbers = getTotalX(a,b);
        System.out.println("There are " + validNumbers + " valid numbers." );
    }
}
