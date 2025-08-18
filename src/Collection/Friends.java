package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Object> set = new HashSet<Object>();

        System.out.println("enter your friends name");
        for (int i = 1; i <5; i++) {
            System.out.println(i);
            String name = sc.next();
            set.add(name);

        }
        System.out.println(set);


    }
}
