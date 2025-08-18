package Array;

import java.util.Scanner;

public class twoDigitNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("ENTER YOUR SIZE:");
            int size = sc.nextInt();

            int numbers[] = new int[size];
            int sum = 0;

            System.out.println("ENTER YOUR NUMBERS:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();

                if (numbers[i] >= 10 && numbers[i] <= 99 && numbers[i] % 2 == 0) {
                    sum += numbers[i];
                }
            }

            System.out.println("SUM OF EVEN TWO DIGIT NUMBERS: " + sum);
        }
    }
