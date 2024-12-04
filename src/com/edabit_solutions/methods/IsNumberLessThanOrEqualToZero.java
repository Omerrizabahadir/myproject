package com.edabit_solutions.methods;

public class IsNumberLessThanOrEqualToZero {

    public static boolean lessThanOrEqualToZero(int num) {

        if (!(num >0)){
        return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(lessThanOrEqualToZero(0));
    }
}
