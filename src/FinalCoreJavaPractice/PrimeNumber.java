package FinalCoreJavaPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");

        int number = sc.nextInt();
        int count =0;
        for(int i=2;i<=number/2;i++){

            if(number%i==0){
                count++;

                break;
            }
        }
        if(number>1&&count==0){
            System.out.println(number +"= is prime number ");
        }else{
            System.out.println(number+"= is not prime number");
        }
    }
}
