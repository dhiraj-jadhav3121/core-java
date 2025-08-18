package practiceOops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        System.out.println("multiplication of :"+num);

        for(int i=1;i<=10;i++){

            System.out.println(num+"X"+i +"="+(num*i));
        }


        }

    }
