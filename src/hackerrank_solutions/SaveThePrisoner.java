package hackerrank_solutions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        /*
         //prisoner sayısı 1 den başladığı için index 1 dir .yani 1 tabanlıdır.
         s - 1 ile bunu bilgisayar dilindeki 0 tabana dönüştürür. çünkü bilgisayarda ilk eleman s=0 dır.
         */
        int lastPrisoner = ((s - 1) + m ) % n;
        return lastPrisoner == 0 ? n : lastPrisoner;
    }
}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int s = Integer.parseInt(firstMultipleInput[2]);

                int result = SaveThePrisoner.saveThePrisoner(n, m, s);

                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}

