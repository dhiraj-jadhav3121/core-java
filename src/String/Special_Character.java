package String;

import java.util.Scanner;

public class Special_Character {
    public static void main(String[] args) {

        //  WAP to accept a string and count the number of special characters in it. (Ignore alphabets and digits)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.next();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                count++;

            }
        }
        System.out.println("Special characters : " + count);
    }
}
