package hackerrank_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingNumbersXAndYInNestedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kaç satır liste olduğunu alma
        int n = scanner.nextInt();

        //içiçe liste oluşturma
        List<List<Integer>> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int d = scanner.nextInt(); //O satırdaki eleman sayısını alma

            List<Integer> tempList = new ArrayList<>();

            for(int j = 0; j < d; j++){
                tempList.add(scanner.nextInt());//Elemanları listeye ekleme
            }
            arrayList.add(tempList);
        }
        //sorgu sayısını alma
        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x<=arrayList.size() && y<=arrayList.get(x - 1).size()){
                System.out.println(arrayList.get(x - 1).get(y - 1));
            }else{
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
