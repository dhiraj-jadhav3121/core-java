package PatternLoop;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your email : ");
        String email = sc.next();


        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (!( (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                System.out.print(ch);
            }
        }
        if(email.contains(".com")){
            System.out.println("\n email contains .com");
        }
        System.out.println();
    }

}
