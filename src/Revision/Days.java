package Revision;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
//        Write a program to print the day of the week based on a number (1=Monday … 7=Sunday).


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number (1-7) ");

        int day = sc.nextInt();
        switch (day){
            case 1 :
                System.out.println("monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("wednesday");
                break;

            case 4 :
                System.out.println("thruesday");
                break ;

            case 5 :
                System.out.println("friday ");
                break ;
            case 6:
                System.out.println("saturday ");
                break ;

            case 7 :
                System.out.println("sunday ");
                break;
            default:
                System.out.println("choose correct number ");
                break;

        }

    }
}
