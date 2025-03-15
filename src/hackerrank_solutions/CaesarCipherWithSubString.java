package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipherWithSubString {

    public static  String caesarCipher(String s, int k) {
        k = k % s.length();
        return s.substring(k) + s.substring(0,k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = CaesarCipher.caesarCipher(s, k);

        System.out.println(result); // Dosyaya yazmak yerine ekrana yaz

        bufferedReader.close();

    }
}
