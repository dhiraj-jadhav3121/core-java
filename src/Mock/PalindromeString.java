package Mock;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            Reverse = Reverse + name.charAt(i);
        }
        if (name.equals(Reverse)) {
            System.out.println(name + " : it is a palindrome ");
        } else {
            System.out.println(name + " : it is a Not-palindrome ");

        }
    }
}
