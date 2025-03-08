package hackerrank_solutions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CutTheSticks {
    public static List<Integer> cutTheStick(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        while (!arr.isEmpty()) {
            result.add(arr.size()); // Mevcut çubuk sayısını ekle

            int min = Collections.min(arr); // En küçük çubuğu bul

            // Her elemandan min'i çıkar ve 0 olmayanları listeye al
            arr = arr.stream().map(num -> num - min).filter(num -> num > 0).collect(Collectors.toList());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = CutTheSticks.cutTheStick(arr);

        // Çıktıyı ekrana yazdır
        result.forEach(System.out::println);

        bufferedReader.close();
    }
}
