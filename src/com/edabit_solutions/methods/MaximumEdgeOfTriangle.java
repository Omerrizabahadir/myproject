package com.edabit_solutions.methods;

/*
Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
Examples;
nextEdge(8, 10) ➞ 17
nextEdge(5, 7) ➞ 11
nextEdge(9, 2) ➞ 10
Notes;
(side1 + side2) - 1 = maximum range of third edge.
The side lengths of the triangle are positive integer
 */
public class MaximumEdgeOfTriangle {
    public static void main(String[] args) {
        int side1 = 8;
        int side2 = 10;

        int side3 = (side1 + side2) - 1;

        System.out.println(side3);

    }
}
