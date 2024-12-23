package codewars.com;

public class FindAverageOfArrayNumbers {
    public static void main(String[] args) {
        int [] numbersOfArray = {1,3,5,7};

        int sum=0;
        int average=0;

        for (int num : numbersOfArray){
           sum +=num;
           average=sum/ numbersOfArray.length;
        }
        System.out.println("Total number of array : "+sum);
        System.out.println("Average og numbers :"+average);
    }
}
