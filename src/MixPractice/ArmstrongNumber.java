package MixPractice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();

        int originalNumber = number;

        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result += digit * digit * digit;
            number = number / 10;

        }
        if (result == originalNumber) {

            System.out.println("this is ArmstrongNumber : " + originalNumber);

        } else {
            System.out.println("this is not ArmstrongNumber : " + originalNumber);

        }
        sc.close();
    }
}
