package TodayPracties29_05_2025;

import java.util.Scanner;

public class ScannerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int number = sc.nextInt();
       int ReverseNumber =0;
       int OriginalNumber=number;
       while(number!=0){
           int digit = number%10;
           ReverseNumber = ReverseNumber*10+digit;
           number=number/10;


       }
       if(OriginalNumber==ReverseNumber){
           System.out.println("the number is palindrome = "+ OriginalNumber);

       }else{
           System.out.println("the number is not palindrome = "+ OriginalNumber);

       }



    }
}
