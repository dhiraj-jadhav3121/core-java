package Revision;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//        Write a program to make a simple calculator
//        using switch (Addition, Subtraction, Multiplication, Division).

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        int choice =0;

        while(choice <5){

            System.out.println("1 . Addition ");
            System.out.println("2 . Substraction ");
            System.out.println("3 . Multiplication ");
            System.out.println("4 . Division ");
            System.out.println("5 . Exit ");

            System.out.println(" choose your choice 1-5");
            choice = sc.nextInt();

            switch (choice){

                case 1 :
                    System.out.println(" you choose addition : ");

                    System.out.println("enter your first number ");
                    num1 = sc.nextDouble();
                    System.out.println("enter your second number ");
                    num2 = sc.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("total sum = "+ sum);
                    break;

                case 2 :
                    System.out.println(" you choose Substraction ");

                    System.out.println("enter your first number ");
                    num1 = sc.nextDouble();
                    System.out.println("enter your second number ");
                    num2 = sc.nextDouble();
                    double sub = num1 - num2;
                    System.out.println("total substraction = "+sub);
                    break ;

                case 3 :
                    System.out.println("you choose multiplication ");

                    System.out.println("enter your first number ");
                    num1 = sc.nextDouble();
                    System.out.println("enter your second number ");
                    num2 = sc.nextDouble();
                     double multi = num1 * num2;
                    System.out.println("total multiplication is = "+ multi);
                    break;

                case 4:
                    System.out.println("you choose Division ");
                    System.out.println("enter your first number ");
                    num1 = sc.nextDouble();
                    System.out.println("enter your second number ");
                    num2 = sc.nextDouble();
                    double divid = num1/num2;
                    System.out.println("total division = "+ divid);
                    break ;

                default:
                    System.out.println("Enter your correct choice (1-4) ");


            }


        }

    }
}
