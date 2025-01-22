package hackerrank_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SamGradesWithScannerClass {

    public  static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> result = new ArrayList<>();
        for(int grade : grades){
          if(grade < 38 || grade % 5 < 3){
              result.add(grade);
          }else {
              result.add(grade + (5 - grade % 5));
          }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();

        System.out.println("Kaç adet puan gireceksiniz?");
        int n = scanner.nextInt();
        System.out.println("Lütfen notları sırayla giriniz:");

        for (int i = 0;i < n;i++){
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        System.out.println("Verilen liste : " + grades);

        List<Integer>roundedGrades = gradingStudents(grades);

        System.out.println("Yuvarlanmış notlar : " +roundedGrades);
    }
}
