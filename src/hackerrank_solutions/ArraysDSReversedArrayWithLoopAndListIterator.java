package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraysDSReversedArrayWithLoopAndListIterator {

    public static List<Integer> reverseArray(List<Integer> a) {

        /*

        Döngü kullanmak istersen ListIterator ile array 'i ters çevirebilirsin
         */
        List<Integer> reversedList = new ArrayList<>();

        ListIterator<Integer> listIterator = a.listIterator(a.size());

        while (listIterator.hasPrevious()) {
            reversedList.add(listIterator.previous());
        }

        return reversedList;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = ArraysDS.reverseArray(arr);

        System.out.println(res);
        bufferedReader.close();

    }

}



