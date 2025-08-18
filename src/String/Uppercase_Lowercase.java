package String;

import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        //WAP to accept a string and convert alternate characters to uppercase and lowercase.

 Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String st=sc.next();

        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(i%2==0){
                System.out.print(Character.toUpperCase(ch));
            }else{
                System.out.print(Character.toLowerCase(ch));
            }
        }


    }
}
