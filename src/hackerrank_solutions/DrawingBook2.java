package hackerrank_solutions;

import java.util.Scanner;

public class DrawingBook2 {
    public static int pageCount(int n, int p) {
        // Baştan sayfa çevirme sayısı
        int fromFront = p / 2;

        // Sondan sayfa çevirme sayısı
        int fromBack = (n / 2) - (p / 2);

        // Minimum sayfa çevirme sayısını döndür
        return Math.min(fromFront, fromBack);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kitap kaç sayfa giriniz:");
        int n = scanner.nextInt();

        System.out.println("Lütfen gidilecek sayfa sayısını giriniz:");
        int p = scanner.nextInt();

        int result = pageCount(n, p);
        System.out.println("Minimum sayfa çevirme sayısı: " + result);
    }
}

