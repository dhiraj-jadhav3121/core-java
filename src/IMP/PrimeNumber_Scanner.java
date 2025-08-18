package IMP;

import java.util.Scanner;

public class PrimeNumber_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");

        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                break;

            }
        }
        if (num > 1 && count == 0) {
            System.out.println("prime number = " + num);

        } else {
            System.out.println("not prime number = " + num);
        }
    }
}
