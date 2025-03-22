package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraysDSReversedArrayWithStreamAPI {

    public static List<Integer> reverseArray(List<Integer> a){

        /*
        Bu yöntem, orijinal listeyi değiştirmez,
        bunun yerine yeni bir ters liste oluşturur.
         */
        List <Integer> reversed = IntStream.range(0, a.size())
                .mapToObj(i -> a.get(a.size() - 1 - i))
                        .collect(Collectors.toList());
        return reversed;
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

