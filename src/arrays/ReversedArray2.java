package arrays;

public class ReversedArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] reversed = new int[numbers.length];

        //Diziyi ters çevirme
        //DİKKAT!!! numbers.length - 1 -> başlangıçta dizinin son elemanı demek.yani 5. 5-1 demek değil
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];  //yani numbers.length - 1 - i ->(numbers.length - 1)-i burada dizinin son elemanı neyse ondan -i yapacak
        }
        //terse çevrilmiş yeni diziyi yazdırma
        for (int num : reversed){
            System.out.println(num);
        }
    }
}
