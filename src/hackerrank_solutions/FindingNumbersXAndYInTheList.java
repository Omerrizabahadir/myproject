package hackerrank_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingNumbersXAndYInTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Dizinin boyutunu alma
        System.out.println("diziniz kaç adet sayıdan oluşacak giriniz!");
        int n = scanner.nextInt();

        // Aranacak sayıyı al
        System.out.println("dizinin içinde armak istediğiniz sayıyı giriniz");
        int findingNumber = scanner.nextInt();

        // Listeyi oluştur
        List<Integer> arrayList = new ArrayList<>();

        // Kullanıcıdan n adet sayı al ve listeye ekle
        System.out.println("diziyi oluşturun!");
        for(int i = 0; i < n; i++){
            arrayList.add(scanner.nextInt());
        }
        // Liste içinde aranan sayıyı bul
        if(arrayList.contains(findingNumber)){
            System.out.println("aradığınız sayı "+findingNumber + " dizide bulunmaktadır");
        }else{
            System.out.println("ERROR!");
        }
    }
}
