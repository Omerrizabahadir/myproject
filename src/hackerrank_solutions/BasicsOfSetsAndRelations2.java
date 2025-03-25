package hackerrank_solutions;

import java.util.HashSet;
import java.util.Set;

public class BasicsOfSetsAndRelations2 {

    public static void main(String[] args) {


        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setA.add(6);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);

        setA.retainAll(setB);

        System.out.println("Kesişim kümesinin eleman sayısı: " + setA.size());

    }
}
