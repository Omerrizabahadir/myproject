package com.edabit_solutions.methods;

public class FormattedString {

    public static void main(String[] args) {
        String firstName = "Ahmed";
        String lastName = "Balcı";

        String result = String.format("Merhaba, benim adım %s %s",firstName,lastName);
        System.out.println(result);

        System.out.println("-------------------");

        String result2 = String.format("%s %s, java öğreniyor.",firstName,lastName);
        System.out.println(result2);
    }

}
