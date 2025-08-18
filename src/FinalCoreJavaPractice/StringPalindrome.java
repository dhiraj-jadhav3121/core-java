package FinalCoreJavaPractice;

import java.util.Comparator;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name : ");

        String name = sc.next();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            reverse =reverse + name.charAt(i);


        }
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println(reverse + " = name is palindrome ");
        } else {
            System.out.println(reverse + " = name is not palindrome ");
        }

    }
}
