package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> number = new HashSet<Integer>();

        System.out.println("enter your number ");
        for (int i = 1; i <= 5; i++) {

            int num = sc.nextInt();
            number.add(num);

        }
        if (number.size() < 5) {

            System.out.println("duplicate number ");

        } else {

            System.out.println("all are unique number");
        }


    }
}
