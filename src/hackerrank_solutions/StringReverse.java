package hackerrank_solutions;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string , print Yes if it is a palindrome, print No otherwise.
Constraints:
A will consist at most  lower case english letters.
Sample Input:
madam
Sample Output:
Yes
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz!");
        String A = sc.next();


        String reversedA = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            char c = A.charAt(i);
            reversedA+=c;
        }

        System.out.println("Kelimenin tersten okunuşu : " + reversedA);
        System.out.println("iki taraftan okununcada kelime aynı mı?");
        if(A.equals(reversedA)){
            System.out.println("EVET");
        }else{
            System.out.println("HAYIR");
        }

    }
}
