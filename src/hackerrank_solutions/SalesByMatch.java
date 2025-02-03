package hackerrank_solutions;

import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar){
        int countRepeatingElement = 0;

        boolean[] isSocksPair = new boolean[n];

        for(int i = 0;i < ar.size();i++){
         if (isSocksPair[i]){
             continue;
         }
         for(int j = i + 1;j < n; j++){
           if(!isSocksPair[j] && ar.get(i).equals(ar.get(j))){
               isSocksPair[i] = true;
               isSocksPair[j] = true;
               countRepeatingElement++;
               break;
           }
         }
        }
        return countRepeatingElement;
    }
    public static void main(String[] args) {
        List<Integer> sockList = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = 9;
        int result = sockMerchant(n, sockList);
        System.out.println(result);
    }
}
