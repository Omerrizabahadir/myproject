package hackerrank_solutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("a / b : " + (a / b));

        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");

        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    sc.close();

    }
}
