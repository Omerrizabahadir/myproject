package com.edabit_solutions.methods;

public class FormattedInteger {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String result = String.format("%d ie %d'nin toplamı : %d'dir.",x,y,x+y);
        System.out.println(result);
    }
}
