package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Password {


    public static void main(String[] args) {
        String password = "9623";

        int count = 0;
        Scanner sc = new Scanner(System.in);

        Set<String> wrongPasswords = new HashSet<>();

        while (wrongPasswords.size() < 3) {

            System.out.println("Enter your Password: ");
            String str = sc.next();

            if (password.equals(str)) {
                System.out.println("your password is Correct");
                break;

            } else {

                count++;
                System.out.println("you enter wrong password " + count + " " + "times");
                wrongPasswords.add(str);
            }
        }

        System.out.println("Total Wrong password enter:" + wrongPasswords);

    }

}

