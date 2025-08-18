package Core_java;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");

        String name= sc.next();
        String reverse= "";
        for(int i=name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
            reverse+=name.charAt(i);

        }
        System.out.println(reverse);


    }
}
