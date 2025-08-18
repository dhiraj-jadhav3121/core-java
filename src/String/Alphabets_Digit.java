package String;

import java.util.Scanner;

public class Alphabets_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR PASSWORD : ");
        String password = sc.next();
        int alphabets = 0;
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch>='A' && ch<='Z') {
                alphabets++;

            }else{
                digit++;
            }
        }
        System.out.println(alphabets);
        System.out.println(digit);


    }

}
