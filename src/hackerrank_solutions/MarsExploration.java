package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsExploration {

    public static int marsExploration(String s) {
        String sos = "SOS";

        int count = 0;

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != sos.charAt(i % 3)){   //(i % 3) ile her harfi "SOS" dizisinin ilgili harfiyle karşılaştırıyoruz.
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int result = MarsExploration.marsExploration(s);

        System.out.println("Hatalı karakter sayısı: " + result);

        bufferedReader.close();
    }
}
