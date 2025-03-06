package hackerrank_solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
    Input bu şekilde olmalı
    Lütfen kaç adet bilgi almak istediğinizi belirtin :
3
lütfen isim ve telefon numarası girin
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle sam=99912222
tom
tom=11122222
banu
Not entry

 */

public class MapUsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaç adet bilgi almak istediğinizi belirtin : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();
        System.out.println("lütfen ism ve telefon numarası kaydı ekleyin");
         for(int i = 0;i < n; i++){
             String name = scanner.nextLine();
             int phone = scanner.nextInt();
             scanner.nextLine();

             phoneBook.put(name, phone);
         }
        System.out.println("isim ile arama yapınız!   (Çıkmak için 'exit' yazınız)");
         while (true){
             String s = scanner.nextLine();

             // Öncelikle çıkış kontrolü yapılmalı
             if(s.equalsIgnoreCase("exit")){
                 System.out.println("Uygulama kapatılıyor...");
                 break;
             }
             if(phoneBook.containsKey(s)){
                 System.out.println(s+ "=" + phoneBook.get(s));
             }else{
                 System.out.println("Not entry(Bu isimde kayıt yoktur!)");
             }
         }
       scanner.close();
    }
}
