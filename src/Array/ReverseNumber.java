package Array;

import java.util.Scanner;

public class ReverseNumber {
    //2. WAP to accept 10 numbers and print in reverse order.

    public static void main(String[] args) {
        int numbers[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBERS ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        for(int i = numbers.length-1;i>=0;i--){

            System.out.println(numbers[i]);



        }




        }


    }

