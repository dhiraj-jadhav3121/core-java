package String;

import java.util.Scanner;

public class MobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbers : ");
        String numbers = sc.next();

        if (numbers.length() == 10) {
            System.out.println("10-digit number ");

        } else {
            System.out.println("NOT-10-digit number");
        }

    }
}

