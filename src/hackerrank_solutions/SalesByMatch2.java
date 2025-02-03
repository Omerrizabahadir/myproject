package hackerrank_solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch2 {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> sockCount = new HashMap<>();

        int pairs = 0;

        for(int sock : ar){
            sockCount.put(sock, sockCount.getOrDefault(sock,0) + 1);
        }
        for (int count : sockCount.values()){
           pairs += count / 2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> sockList = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = sockList.size();
        int result = sockMerchant(n, sockList);
        System.out.println("Toplam çift sayısı: " + result);
    }
}
