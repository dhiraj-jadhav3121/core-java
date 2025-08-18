package Core_java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
         int number= sc.nextInt();
         boolean prime = true;

         for(int i=2;i<=number/2;i++){
             if(number%i==0){
                 prime=false;
                 break;

             }

         }
         if(prime){
             System.out.println(number+" = prime number ");
         }else{
             System.out.println(number+ "= not prime number ");
         }

    }
}
