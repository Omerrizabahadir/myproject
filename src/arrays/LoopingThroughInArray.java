package arrays;

public class LoopingThroughInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-------------");
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
