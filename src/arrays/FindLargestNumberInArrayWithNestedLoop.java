package arrays;

public class FindLargestNumberInArrayWithNestedLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 5, -1, -23, 12, 23};
        int max = numbers[0];  //başlangıçta en büyük sayı dizinin 0. indexi olsun

        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0;j< numbers.length;j++){
                if(numbers[i] > max){
                    max = numbers[j];
                }
            }
        }
        System.out.println("En büyük sayı : " + max);
    }
}
