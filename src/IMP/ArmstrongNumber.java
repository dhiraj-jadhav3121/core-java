package IMP;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER :");
        int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;

            sum = sum + digit * digit * digit;

            num = num / 10;

        }
        if (originalNumber == sum) {
            System.out.println(originalNumber + " = is the ArmstrongNumber");
        } else {
            System.out.println(originalNumber + " = is the NotArmstrongNumber");
        }


    }
}
