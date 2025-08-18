package Exception_Handling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your first number : ");
            int number1 = sc.nextInt();
            System.out.println("Enter your  second number : ");
            int number2 = sc.nextInt();

            int division = number1 / number2;
            System.out.println( "division of two number = "+division);

        } catch (Exception e) {
            System.out.println("infinity ");
        }finally {
            System.out.println("Good Luck !!! ");
        }


    }
}

