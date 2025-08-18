package homeworkArray;

import java.util.Scanner;

public class TableOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number to store ");

        int num = s.nextInt();

        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num * (i + 1);

        }
        System.out.println("table of " + num);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(num + "X" + (i + 1) + "=" + numbers[i]);
        }
    }
}
