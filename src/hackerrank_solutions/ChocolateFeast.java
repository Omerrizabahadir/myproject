package hackerrank_solutions;

import java.io.*;



public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {  // Kaç ambalajın yeni bir çikolata almak için yeterli olduğunu gösterir.
        int chocolates = n / c;   // İlk alınan çikolatalar
        int wrappers = chocolates; // Yeniden çikolata almak için kullandığımız ambalaj sayısını temsil eder.

        while (wrappers >= m) {  // Ambalaj sayısı yeterliyse yeni çikolata alabiliyoruz.
            int newChocolates = wrappers / m;   // Yeni çikolatalar
            chocolates += newChocolates;        // Çikolataları topluyoruz
            wrappers = newChocolates + (wrappers % m);  // Yeni alınan çikolataların ambalajlarıyla, eski ambalajlardan kalanları birleştirir.
        }
        return chocolates;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Test sayısını alıyoruz
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        // Testlerin her biri için işlemleri yapıyoruz
        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]); // Elimizdeki para
            int c = Integer.parseInt(firstMultipleInput[1]); // Çikolatanın fiyatı
            int m = Integer.parseInt(firstMultipleInput[2]); // Bedava çikolata almak için gereken ambalaj sayısı

            int result = chocolateFeast(n, c, m);  // Sonucu hesapla

            System.out.println(result);  // Sonucu konsola yazdır
        }

        bufferedReader.close();
    }
}
