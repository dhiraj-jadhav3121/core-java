package Array;

import java.util.Scanner;

public class FriendsName {
    public static void main(String[] args) {
        String friends[] = new String[5];

        Scanner sc = new Scanner(System.in);


        System.out.println("ENTER YOUR NUMBERS ");
        for (int i = 0; i < friends.length; i++)
            friends[i] = sc.nextLine();

        for (int i = 0; i < friends.length; i++) ;

        System.out.println("Friends 1 : " + friends[1]);
        System.out.println("Friends 2 : " + friends[2]);
        System.out.println("Friends 3 : " + friends[3]);


    }
}
