package subarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
List<List<Integer>> Kullanarak Negatif Alt Dizileri Saklama
 */
public class SubarrayWithStoringNegativeSubstrings {

    public static List<List<Integer>> findNegativeSubarrays(List<Integer> arr){

        List<List<Integer>> negativeSubarrays = new ArrayList<>();

        for(int i = 0;i < arr.size();i++){
            int sum = 0;
            List<Integer> subArray = new ArrayList<>();
            for(int j = i; j < arr.size(); j++){
                subArray.add(arr.get(j));
                sum += arr.get(j);

                if(sum < 0){
                  negativeSubarrays.add(new ArrayList<>(subArray));
                }
            }
        }
        return negativeSubarrays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizinin uzunluğunu girin: ");

        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Lütfen dizinin elemanlarını giriniz:");

        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        // int[] -> List<Integer> çevirme
        List<Integer> arrList = new ArrayList<>();
        for(int num : arr){
            arrList.add(num);
        }
        // Negatif alt dizileri bul
        List<List<Integer>> result = findNegativeSubarrays(arrList);

        // Sonuçları yazdır
        System.out.println("Negatif toplamlı alt diziler:");
        for(List<Integer> subarray : result){
            System.out.println(subarray);
        }
        System.out.println("Toplam negatif toplamlı alt dizi sayısı: " + result.size());
    }
}
