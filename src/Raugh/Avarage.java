package Raugh;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("enter your second number:");
        int num2 = sc.nextInt();
        System.out.println("enter your third number:");
        int num3 = sc.nextInt();

        float avarage = (num1 + num2 + num3) / 3f;
        System.out.println(avarage);
    }
}
