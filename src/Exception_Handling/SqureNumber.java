package Exception_Handling;

import java.util.Scanner;

public class SqureNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            int Square = number * number;
            System.out.println(Square);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number ");
        } finally {
            System.out.println("try again  !!!");
        }


    }
}
