package Core_java;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
         String name = sc.next();
         String result= " ";


         for(int i=0;i<name.length();i++){
             char ch = name.charAt(i);

             if(result.indexOf(ch)==-1){

                 result=result+ch;

             }

               }
        System.out.println(result);

           }

         }
