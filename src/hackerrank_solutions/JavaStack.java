package hackerrank_solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* for (int i = 0;i < 3;i++){
            String input = sc.next();
            System.out.println(isBalanced(input));
        }*/
        while (sc.hasNext()) {  // Kullanıcı giriş yapmaya devam ettiği sürece çalışır
            String input = sc.next();
            if (input.equals("exit")) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            System.out.println(isBalanced(input));
        }
        sc.close();
        System.out.println("Program sonlandı");
    }
}