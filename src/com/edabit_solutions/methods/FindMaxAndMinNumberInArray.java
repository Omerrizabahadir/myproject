package com.edabit_solutions.methods;

public class FindMaxAndMinNumberInArray {
    /*
    Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.

Examples
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]

minMax([2334454, 5]) ➞ [5, 2334454]

minMax([1]) ➞ [1, 1]
Notes
All test arrays will have at least one element and are valid.
     */

    public static double[] minMax(double[] arr) {
        double min = arr[0];
        double max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i =0;i < arr.length;i++){
            if(arr[i] < min){

                min = arr[i];
            }else{

            }
        }
        System.out.println("en küçük sayı : "+min);
        System.out.println("en büyük sayı : "+max);
        return new double[]{min,max};
    }
    public static void main(String[] args) {
        double[] numbers ={1, 2, 3, 4, 5};
        double[] result = minMax(numbers);

        System.out.println("min : " + result[0] + ", max :" +result[1]);

    }
}
