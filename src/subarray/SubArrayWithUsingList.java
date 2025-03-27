package subarray;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithUsingList {

    public static int countNegativeSubarrays(ArrayList<Integer> arr){
        int countNegative = 0;

        for(int i = 0;i < arr.size();i++){
            int sum = 0;
            for (int j = i; j < arr.size();j++){
                sum += arr.get(j);
                if(sum < 0){
                   countNegative++;
                }
            }
        }

        return countNegative;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizinin uzunluğunu giriniz!");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Dizinin uzunluğunu girin: ");

        for(int i = 0;i < n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();

        int result = countNegativeSubarrays(arr);
        System.out.println("Dizinin negatif alt dizileri  : " + result);
    }
}
