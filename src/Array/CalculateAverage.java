package Array;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {

        int numbers[] = new int[5];

        Scanner sc = new Scanner(System.in);
        float sum = 0.0f;

        System.out.println("ENTER YOUR NUMBERS ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();
            for (int i= 0; i < numbers.length; i++)
                sum = sum + numbers[i];
                System.out.println((float) (sum / 5));


            }


        }

