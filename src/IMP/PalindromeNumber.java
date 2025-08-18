package IMP;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number : ");
        int num = sc.nextInt();
        int reverseNumber=0;
        int OriginalNumber = num;

        while(num!=0){
            int digit = num%10;
            reverseNumber= reverseNumber*10+digit;

            num=num/10;

        }
        if(OriginalNumber==reverseNumber){
            System.out.println("the number is palindrome : "+ OriginalNumber);

        }else{
            System.out.println("the number is Not palindrome : "+ OriginalNumber);
        }

    }
}
