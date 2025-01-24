package hackerrank_solutions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a,List <Integer>b){
        int start = a.get(a.size() - 1);  // 'a' listesindeki en büyük sayıdan başla.
        int end = b.get(0);               // 'b' listesindeki en küçük sayıda bitir.

        int count = 0;

        List<Integer>validNumbers = new ArrayList<>();  //uygun sayıları tutan liste

        for(int x = start; x <= end; x++){   //'start' ile 'end' arasındaki tüm sayılara bak.
            int finalX = x;
            boolean isDivideAllAValue = a.stream().allMatch(num -> finalX % num == 0); // x tüm a değerlerini böler mi?.num  a listesindeki her bir elemanı temsil ediyor
            int finalX1 = x;
            boolean isDividedAllBValue = b.stream().allMatch(num -> num % finalX1 == 0);// x tüm b değerlerine bölünür mü?

            if (isDivideAllAValue && isDividedAllBValue){
                count++;
                validNumbers.add(x);
            }
        }
        System.out.println("Uygun sayılar : " + validNumbers);
        return count;
    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2,4);
        List<Integer> b = Arrays.asList(16,32,96);

       int result =  getTotalX(a,b);
        System.out.println("Uyan " + result + " sayı vardır");
    }
}
