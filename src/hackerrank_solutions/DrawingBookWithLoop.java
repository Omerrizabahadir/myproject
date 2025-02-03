package hackerrank_solutions;

import java.util.Scanner;

public class DrawingBookWithLoop {
    public static int pageCount(int n, int p){
        int frontPageStarting = 0;
        int backPageStarting = 0;

        for (int i = 1; i <= p; i+=2){
            frontPageStarting++;
        }
        for(int i = (n % 2 == 0 ? n : n - 1);i > p;i-=2){
          backPageStarting++;
        }
        return Math.min(frontPageStarting, backPageStarting);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kitap kaç sayfa giriniz");
        int p = scanner.nextInt();

        System.out.println("Lütfen gidilecek sayfa sayısını giriniz!");
        int n = scanner.nextInt();



        int result = pageCount(p, n);
        System.out.println("Minimum sayfa çevirme sayısı: " + result);
    }
}
