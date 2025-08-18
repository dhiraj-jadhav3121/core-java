package String;

import java.util.Scanner;

public class TernoryOperator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int a = sc.nextInt();

        String ans = a > 5 ? "A is great" : "A is Bad";
        System.out.println(ans);
    }
}
