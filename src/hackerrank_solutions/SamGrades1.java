package hackerrank_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamGrades1 {

    public static List<Integer> gradingStudents(List<Integer> grades){
        List <Integer> result = new ArrayList<>();
        for(int grade : grades){
          if(grade < 38 || grade %5 <3){
              result.add(grade);
          }else{
              result.add(grade +(5-grade % 5));
          }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        System.out.println("Verilen Liste : " + grades);

        // Notları yuvarla
        List<Integer> roundedGrades = gradingStudents(grades);

        // Sonuçları yazdır
        System.out.println("Yuvarlanmış Notlar: " + roundedGrades);
    }
}
