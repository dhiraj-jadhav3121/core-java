package String;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your age : ");
        int age = sc.nextInt();


        System.out.println("enter your DOB : ");
        int dob = sc.nextInt();

        sc.nextLine();

        System.out.println("ENTER your location");
        String location = sc.nextLine();

        System.out.println("Name" + "\tAge" + "\tDob" + "\tLocation");

        System.out.println(name +" "+"\t"+ age +"\t"+ dob+ " "+ location);

        System.out.println("=============================================================================");


    }

}
