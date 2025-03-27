package subarray;

import java.util.Scanner;

public class SubArray {

    public static int countNegativeSubarrays(int [] arr){

        int countNegative = 0;

        for(int i = 0;i < arr.length;i++){
            int sum = 0;
            for (int j = i;j < arr.length;j++){
                sum += arr[j];
                if(sum < 0){
                  countNegative++;
                }
            }
        }
        return countNegative;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin uzunluğunu girin: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Lütfen dizinin elemanlarını yazınız!");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result =  countNegativeSubarrays(arr);
        System.out.println("Dizinin negatif toplamlı alt dizelerinin sayısı : " + result);
    }
}
