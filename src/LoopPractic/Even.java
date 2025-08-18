package LoopPractic;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number =");

        int number = sc.nextInt();


        if (number % 2 == 0) {
            System.out.println("the number is odd =" + number * number);

        } else if (number % 2 == 1){
            System.out.println("the number is even =" + number * number * number);


        }


    }

}

