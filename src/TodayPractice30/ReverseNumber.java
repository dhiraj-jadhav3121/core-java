package TodayPractice30;

import forLoops.RevesreNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        int number = sc.nextInt();
       int ReverseNumber= 0;
       while(number!=0){
           int digit = number%10;
          number=number/10;
           ReverseNumber=ReverseNumber*10+digit;


       }
        System.out.println("reverseNumber ="+ReverseNumber);
    }
}
