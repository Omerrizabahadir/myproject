package hackerrank_solutions;

import java.util.Scanner;
/*
   Anagram, bir kelimenin harflerinin yerleri değiştirilerek başka bir kelime oluşturulmasıdır.
🔹 Harf sayısı ve harfler aynı olmalıdır, sadece sıralama farklı olabilir.


 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Anagram kontrolü
        if (isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        sc.close();
    }
    public static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s","").toLowerCase();
        b = b.replaceAll("\\s","").toLowerCase();

        if(a.length() != b.length()){
           return  false;
        }
        int[] charCount = new int[26];
        for(int i = 0;i < a.length();i++){
          charCount[a.charAt(i) - 'a']++;
          charCount[b.charAt(i) - 'a']--;
        }
        for(int count : charCount){
            if(count != 0){
                return  false;
            }
        }
        return true;
    }
}

