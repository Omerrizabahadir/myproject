package codewars.com;

import java.util.Arrays;

public class FindAverageOfArrayNumbersWithJava8 {

   public static int findAverage(int[] nums){

       return Arrays.stream(nums)
               .reduce(0,(a,b) ->  a + b)/nums.length;

       /*
       return (int) Arrays.stream(nums)
               .average().orElse(0);
       */
   }
    public static void main(String[] args) {
        int [] nums = {1,3,5,7};

        double average =findAverage(nums);
        System.out.println("Array's numbers average :  "+ average);
    }
}
