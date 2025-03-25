package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerRankBasicsOfSetsAndRelation2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //A kümesinin eleman sayısını kullanıcıdan alma
        int a = sc.nextInt();
        System.out.println("A kümesinin eleman sayısı: " + a);

        Set<Integer> setA = new HashSet<>();

        // A kümesindeki elemanları setA'ya ekliyoruz.
        for(int i = 0;i < a;i++){
            int value = sc.nextInt();
            System.out.println("A kümesinin elemanı: " + value);
            setA.add(value);
        }
        // B kümesinin eleman sayısını alıyoruz.
        int b = sc.nextInt();
        System.out.println("B kümesinin eleman sayısı: " + b);

        Set<Integer> intersectionSet = new HashSet<>();

        // B kümesindeki her eleman için, A kümesinde olup olmadığını kontrol ediyoruz.
        for(int i = 0;i < b;i++){
           int num = sc.nextInt();
            System.out.println("B kümesinin elemanı: " + num);
           if(setA.contains(num)){
               intersectionSet.add(num);
           }
        }
        // Kesişim kümesinin boyutunu yazdırıyoruz
        System.out.println("Kesişim kümesinin boyutu : " + intersectionSet.size());
    }
}
