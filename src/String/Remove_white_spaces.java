package String;

import java.util.Scanner;

public class Remove_white_spaces {
    public static void main(String[] args) {
        //WAP to accept a string and remove all the white space characters from it.

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name : ");

        String name = sc.nextLine();
        String result = "";

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(ch!=' '){
                result=result+ch;


            }

        }
        System.out.println(result);

    }
}
