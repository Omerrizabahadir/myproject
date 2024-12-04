package arrays;


public class ReversedArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        for (int i = 0;i< numbers.length;i++){
            reversed[i] = numbers[(numbers.length-1)-i];
        }
        for (int num : reversed){
            System.out.println(num);
        }
        
    }
}
