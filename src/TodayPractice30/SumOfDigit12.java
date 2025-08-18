package TodayPractice30;

import java.util.Scanner;

public class SumOfDigit12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");

        int number = sc.nextInt();
        int sum = 0;
        while(number!=0){
            int digit = number%10;
            number=number/10;
            sum = sum+digit;

        }
        System.out.println("Total Sum ="+sum);

    }
}
