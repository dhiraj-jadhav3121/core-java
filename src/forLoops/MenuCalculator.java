package forLoops;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double num1;
        double num2;


        int choice = 0;


        while (choice < 5) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5)");
            choice = sc.nextInt();


            switch (choice) {


                case 1:
                    System.out.println("Enter first Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second Number");
                    num2 = sc.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("total sum:" + sum);
                    break;
                case 2:
                    System.out.println("Enter first Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second Number");
                    num2 = sc.nextDouble();
                    double sub = num1 - num2;
                    System.out.println("Sub:" + sub);
                    break;
                case 3:
                    System.out.println("Enter first Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second Number");
                    num2 = sc.nextDouble();
                    double multiply = num1 * num2;
                    System.out.println("Multiplication of two Num:" + multiply);
                    break;

                case 4:

                    System.out.println("Enter first Number");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second Number");
                    num2 = sc.nextDouble();
                    double divide = num1 / num2;
                    System.out.println("Divide of two Number:" + divide);
                    break;

                default:
                    System.out.println("Please enter your correct choice ");

            }
        }


    }


}

