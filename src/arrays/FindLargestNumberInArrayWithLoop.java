package arrays;

public class FindLargestNumberInArrayWithLoop {

    public static void main(String[] args) {

        int[] numbers = {90, 98, 12, 112, 321, 1};
        int max = numbers[0];

        for (int i = 1; i< numbers.length;i++){
            if (numbers[i] > max){
                max = numbers[i];
            }else {
                
            }
        }
        System.out.println("En büyük sayı : " + max);
    }
}