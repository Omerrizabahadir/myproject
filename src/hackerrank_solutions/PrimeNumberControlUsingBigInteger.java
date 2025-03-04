package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumberControlUsingBigInteger {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(bufferedReader.readLine());

        bufferedReader.close();

         /*n.isProbablePrime() içine yazılacak değer güvenlik seviyesidir. Doğru sonuç yüzdesini veriyor.
         1- 99: 1-99: Bu değerler, genellikle iyi sonuçlar verir. 1 (yüksek güvenilirlik seviyesi) ile başlanabilir, ancak 100 gibi daha yüksek bir değerle test yapmanız, daha fazla işlem süresi gerektirir.
            100: En yüksek güvenilirlik seviyesi. Sonuç çok daha güvenilirdir, ancak hesaplama süresi uzun olacaktır. Çok büyük sayılar üzerinde işlem yaparken bu seviyeyi kullanabilirsiniz. 0 : En düşük güvenilirlik seviyesi.
            Bu, sayının asal olduğunu sadece hızlı bir şekilde tahmin eder, ancak çok düşük doğruluk sağlar. Genellikle bu değeri kullanmak tavsiye edilmez.*/
        if(n.isProbablePrime(1)){

            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
