package hackerrank_solutions;

import java.util.Arrays;
import java.util.List;

public class SamGrades2 {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);

            if (grade >= 38) {
                int nextMultipleOf5 = grade + (5 - grade % 5);//Bir sonraki 5 'in katı
                if(nextMultipleOf5 - grade < 3){ //fark 3'ten küçükse yuvarla
                    grades.set(i, nextMultipleOf5);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33, 40, 98, 97);
        System.out.println("Verilen Liste : " + grades);

        // Notları yuvarla
        List<Integer> roundedGrades = gradingStudents(grades);

        // Sonuçları yazdır
        System.out.println("Yuvarlanmış Notlar: " + roundedGrades);
    }
}
