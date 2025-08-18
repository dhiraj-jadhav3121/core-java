package String;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");

        int age = sc.nextInt();
        String answer = age > 18 ? "ELIGIBLE FOR VOTE " : "NOT ELIGIBLE FOR VOTE";

        System.out.println(answer);
    }
}
