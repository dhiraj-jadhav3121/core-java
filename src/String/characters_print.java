package String;

import java.util.Scanner;

public class characters_print {
    public static void main(String[] args) {

        //WAP to accept a string and print only those characters which appear more than once.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Name : ");
        String name = sc.next();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int count = 0;
            for (int j = 0; j < name.length(); j++) {

                if (name.indexOf(ch) != i)

                    if (ch == name.charAt(j)) {
                        count++;

                    }

            }
            if (count > 1) {
                System.out.println(ch + "-->" + count);


            }
        }

    }
}