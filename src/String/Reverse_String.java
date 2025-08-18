package String;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter name : ");
        String reverse = "";

        String name= s.next();
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);

        }
        System.out.println(reverse);

    }
}
