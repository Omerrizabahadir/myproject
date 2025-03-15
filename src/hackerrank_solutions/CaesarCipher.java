package hackerrank_solutions;

import java.io.*;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        StringBuilder encrypted = new StringBuilder();
        k = k % 26; // 26 harfli alfabede gereksiz büyük kaymaları önler

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a'; // Büyük/küçük harf kontrolü
                char newChar = (char) ((c - base + k) % 26 + base);
                encrypted.append(newChar);
            } else {
                encrypted.append(c); // Harf değilse değiştirme
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = CaesarCipher.caesarCipher(s, k);

        System.out.println(result); // Dosyaya yazmak yerine ekrana yaz

        bufferedReader.close();
    }
}