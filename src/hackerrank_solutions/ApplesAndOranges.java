package hackerrank_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApplesOnSamHouse = 0;

        for (int i = 0; i < apples.size(); i++) {
            int m = a + apples.get(i);
            int landingPositionOfApples = m;

            if (m >= s && m <= t) {
                countApplesOnSamHouse++;
            }
        }
        int countOrangesOnSamHouse = 0;

        for (int i = 0; i < oranges.size(); i++) {
            int n = b + oranges.get(i);
            int landingOrangesOnSamHouse = n;

            if (n >= s && n <= t) {
                countOrangesOnSamHouse++;
            }
        }
        System.out.println(countApplesOnSamHouse);
        System.out.println(countOrangesOnSamHouse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sam'in evinin başlangıç ve bitiş noktalarını giriniz (s,t) : ");
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println("Elma ağacının yerini giriniz (a): ");
        int a = scanner.nextInt();

        System.out.println("Portakal ağacının yerini giriniz (b) :");
        int b =scanner.nextInt();

        System.out.println("3 adet elma değeri giriniz : ");
        List<Integer> apples = new ArrayList<>();
        for (int i = 0; i < 3;i++){
            apples.add(scanner.nextInt());
        }
        System.out.println("2 adet portakal değeri giriniz : ");
        List<Integer> oranges = new ArrayList<>();
        for(int i=0;i < 2;i++){
          oranges.add(scanner.nextInt());
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
}
