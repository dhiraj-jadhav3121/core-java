package String;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your usernamr : ");

        String username = sc.next();
        int vowel = 0;
        int consonants = 0;


        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (Character.isLetter(ch))

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
                    vowel++;

                } else {
                    consonants++;

                }
             }
        System.out.println("vowel present in username :  " + vowel);
        System.out.println("consonants present in username : " + consonants);


    }
}
