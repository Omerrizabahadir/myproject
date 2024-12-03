package com.edabit_solutions.methods;

/*
Write a function that takes the base and height of a triangle and return its area.
Examples
triArea(3, 2) ➞ 3
triArea(7, 4) ➞ 14
triArea(10, 10) ➞ 50
Notes
The area of a triangle is: (base * height) / 2
Don't forget to return the result.
 */
public class AreaOfATriangle {
    public static int triArea(int base, int height) {
       

        if (base < 0 || height < 0) {
            return -1;
        }

        return (base * height) / 2;
    }

    public static void main(String[] args) {


        System.out.println("triangle area is : " + triArea(5,4));
    }
}
