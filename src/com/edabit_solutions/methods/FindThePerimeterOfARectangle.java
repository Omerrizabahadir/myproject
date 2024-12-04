package com.edabit_solutions.methods;
/*
Create a function that takes length and width and finds the perimeter of a rectangle.
Examples:
findPerimeter(6, 7) ➞ 26
findPerimeter(20, 10) ➞ 60
findPerimeter(2, 9) ➞ 22
Notes:
Don't forget to return the result.

dikdörtgenin çevresi->Ç=2(a+b) dir.
 */
public class FindThePerimeterOfARectangle {

    public static int findPerimeter(int length, int width) {

        int P = 2 * (length + width);
        return P;
    }
    public static void main(String[] args) {

        System.out.println(findPerimeter(20,10));
    }
}
