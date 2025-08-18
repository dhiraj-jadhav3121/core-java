package TodayPracties29_05_2025;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number");
        int number = sc.nextInt();

        int ReverseNumber = 0;
        int OriginalNumber = number;
        while (number != 0) {

            int digit = number % 10;
            ReverseNumber = ReverseNumber * 10 + digit;
            number = number / 10;


        }
        if (ReverseNumber == OriginalNumber) {
            System.out.println("Number is PalindromeNumber = " + OriginalNumber);
        } else {
            System.out.println("Number is Not PalindromeNumber= " + OriginalNumber);
        }
    }
}
