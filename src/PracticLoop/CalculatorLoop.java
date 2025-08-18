package PracticLoop;

import java.util.Scanner;

public class CalculatorLoop {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        int choice =0;


        while(choice<5){


            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. divide");
            System.out.println("5. exit ");
            System.out.println("enter number between 1-5");
            choice= sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("enter first number");
                    num1= sc.nextDouble();
                    System.out.println("Enter second number");
                    num2=sc.nextDouble();
                    double sum=num1+num2;
                    System.out.println("total sum="+sum);
                    break;

                case 2:

                    System.out.println("Enter First Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second Number");
                    num2 = sc.nextDouble();
                    double sub=num1-num2;
                    System.out.println("total subtraction="+sub);
                    break;

                case 3:
                    System.out.println("Enter First Number");
                    num1= sc.nextDouble();
                    System.out.println("Enter Second Number");
                    num2 = sc.nextDouble();
                    double multiply =num1*num2;
                    System.out.println("Total Multiply ="+multiply);
                    break;

                case 4:
                    System.out.println("Enter First Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter First Number");
                    num2 = sc.nextDouble();
                    double divide = num1/num2;
                    System.out.println("total division="+divide);
                    break;

                default:
                    System.out.println("enter valid number");

            }

        }

    }
}
