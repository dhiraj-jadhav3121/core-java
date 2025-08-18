package homeworkArray;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int numbers []= new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 6 numbers : ");
        for(int i = 0; i< numbers.length;i++){
            numbers[i]= sc.nextInt();

        }
        System.out.println("even numbers : ");
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.print(numbers[i]+",");
            }
        }
        System.out.println("\nodd numbers : ");
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2==1){
                System.out.print(numbers[i]+",");
            }
        }


    }
}
