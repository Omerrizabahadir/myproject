package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberControl {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        if(isPrime(n)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static boolean isPrime(int n){
        if(n < 2){
           return false;
        }
        if(n == 2){
           return  true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3;i * i <= n;i+=2){
            if(n % i ==0){
             return  false;
            }
        }
        return true;
    }
}
