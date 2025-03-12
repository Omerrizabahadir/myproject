package design_patterns.hackerRankPrblem_java_factory_dessign_pattern_solution;

import java.util.Scanner;

import java.security.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();

        try {
            Food food = foodFactory.getFood(sc.nextLine());
            System.out.println("The factory returned " + food.getClass().getSimpleName());
            System.out.println(food.getType());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}