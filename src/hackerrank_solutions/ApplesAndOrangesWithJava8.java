package hackerrank_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplesAndOrangesWithJava8 {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List <Integer> oranges){
        long countApplesOnSamHouse = apples.stream()
                .map(apple -> a + apple)
                .filter(position -> position >= s && position <= t)
                .count();

        long countOrangesOnSamHouse = oranges.stream()
                .map(orange -> b + orange)
                .filter(position -> position >=s && position <= t)
                .count();

        System.out.println("Eve düşe elma sayısı : " + countApplesOnSamHouse);
        System.out.println("Eve düşe portakal sayısı : " + countOrangesOnSamHouse);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Evin başlangıç ve bitiş değerleri (s,t) : ");
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println("Elma ağacının başlangıç değeri (a) :");
        int a = scanner.nextInt();

        System.out.println("Portakal ağacının başlangıç değeri (b) :");
        int b = scanner.nextInt();

        System.out.println("Lütfen 3 adet elma değeri giriniz !");
        List<Integer> apples = new ArrayList<>();
        for (int i = 0;i < 3; i++){
            apples.add(scanner.nextInt());
        }
        System.out.println("Lütfen 2 adet portakal değeri giriniz !");
        List<Integer> oranges = new ArrayList<>();
        for (int i =0;i < 2; i++){
            oranges.add(scanner.nextInt());
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
}
