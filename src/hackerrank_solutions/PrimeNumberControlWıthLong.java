package hackerrank_solutions;

public class PrimeNumberControlWıthLong {
    public static void main(String[] args) {
        long n = 104729L;

        if(isPrime(n)){
            System.out.println(n + " : is prime.");
        }else{
            System.out.println(n + " : is not prime.");
        }
    }
    public static boolean isPrime(long n ){
      if(n < 2) return false;
      if (n == 2) return true;
      if(n % 2 == 0) return false;

      for(long i = 3;i * i <= n;i+=2){
         if(n % i ==0){
             return  false;
         }
      }
        return true;
    }
}
