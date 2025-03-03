package hackerrank_solutions;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 1; i <= s.length() - k; i++){
            String sub = s.substring(i, i + k);

            if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }

            if(sub.compareTo(largest) > 0){
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }
}