package set;

import java.util.HashSet;

public class BasicsofSetsAndRelations3 {
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

        setA.removeAll(setB);
        System.out.println(setA.size());

    }
}
