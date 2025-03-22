package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraysDSReversedArrayWithUsingStack {

    public static List<Integer> reverseArray(List<Integer> a) {

        /*
        (This method does not change the original list, instead it creates a new reversed list.)
         */
        Stack<Integer> stack = new Stack<>();

        // Liste elemanlarını stack'e koy
        stack.addAll(a);

        // Stack'ten elemanları çıkararak ters liste oluştur
        List<Integer> reversedList = new ArrayList<>();

        while (!stack.isEmpty()){
            reversedList.add(stack.pop());
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
