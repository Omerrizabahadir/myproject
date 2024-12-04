package com.edabit_solutions.methods;

public class ConcatStringName {
    public static String nameString(String name) {
        String b = "Edabit";
        String result = name + b;
        return result;
    }
    public static void main(String[] args) {

        System.out.println(nameString("Mubashir"));
        System.out.println(nameString("Matt"));
    }
}
