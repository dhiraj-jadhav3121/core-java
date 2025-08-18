package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.next();
        String original = name.toUpperCase();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);

        } 
        if (original.equals(reverse)) {
            System.out.println("name is palindrome :" + name);
        } else {
            System.out.println("name is not palindrome : " + name);
        }
    }
}
