package hackerrank_solutions;

import java.util.Scanner;

public class SherlockAndSquares {

    public static int squares(int a, int b) {
        int startSquare = (int) Math.ceil(Math.sqrt(a));
        int endSquares = (int) Math.floor(Math.sqrt(b));

        /*endSquare - startSquare + 1 ifadesi   :
        startSquare ile endSquare arasındaki tam karelerin sayısını hesaplar.
        Neden? Eğer aralıktaki kareler arasında hiç tam kare yoksa (örneğin, startSquare > endSquare), o zaman (endSquare - startSquare + 1)
        negatif bir değer olacaktır.
        Bu durumda, negatif bir sayı yerine 0 döndürmek, "hiç kare sayı yok" anlamına gelir.
         */
        return Math.max(0, (endSquares - startSquare + 1));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Test case sayısı

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = squares(a, b);  // Doğru metot çağrımı
            System.out.println(result);
        }

        scanner.close();
    }
}
