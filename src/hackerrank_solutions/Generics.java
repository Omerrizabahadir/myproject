package hackerrank_solutions;

import java.util.Scanner;

public class Generics {
    /*
    Generic methods are a very efficient way to handle multiple datatypes using a single method.
    This problem will test your knowledge on Java Generic methods.
    Let's say you have an integer array and a string array.
    You have to write a single method printArray that can print all the elements of both arrays.
    The method should be able to accept both integer arrays or string arrays.
        You are given code in the editor. Complete the code so that it prints the following lines:

    1
    2
    3
    Hello
    World
    Do not use method overloading because your answer will not be accepted.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("kaç adet tamsayı gireceksiniz?");
        int n = sc.nextInt();
        sc.nextLine();
        Integer [] intArray = new Integer[n];

        System.out.println("lütfen tamsayılarınızı giriniz!");
        for(int i = 0;i < n; i++){
            intArray[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("kaça adet kelime gireceksiniz?");
        int m = sc.nextInt();
        sc.nextLine();
        String [] stringArray = new String[m];


        System.out.println("lütfen kelimeleri giriniz!");
        for(int i = 0;i < m;i++){
            stringArray[i] = sc.nextLine();
        }
        printArray(intArray);
        printArray(stringArray);
    }
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}
