package String;

import java.util.Locale;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name : ");
        String s1= sc.next();
        System.out.println("enter second name : ");
        String s2 = sc.next();
        System.out.println("enter third name : ");
        String s3= sc.next();

        //"AMOL"   ---> o start ---> 1 before end A
        System.out.print(Character.toUpperCase(s1.charAt(0))+".");
        System.out.print(Character.toUpperCase(s2.charAt(0))+".");
        System.out.println(s3.substring(0,1).toUpperCase()+s3.substring(1).toLowerCase());



    }
}
