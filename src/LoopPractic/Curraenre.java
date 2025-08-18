package LoopPractic;

import java.util.Scanner;

public class Curraenre {
    public static void main(String[] args) {
        //4. WAP to convert the INR to dollar if variable currency has value '$' else convert the INR to pounds.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount = ");
        int amount = sc.nextInt();

        char currency = '$';
        if(currency =='$'){
            System.out.println(amount/85);
        }else{
            System.out.println(amount/105);
        }

    }
}
