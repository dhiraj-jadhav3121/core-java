package Array;

import java.util.Scanner;

public class firstLastNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR SIZE ");


        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("ENTER YOUR NUMBERS ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) ;

        System.out.println("first number =" + numbers[0]);
        System.out.println("last number = " + numbers[numbers.length-1]);
    }
}
