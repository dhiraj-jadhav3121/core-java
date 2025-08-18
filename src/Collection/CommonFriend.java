package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> group1 = new HashSet<>();
        HashSet<String> group2 = new HashSet<>();

        System.out.println(" ENTER YOUR 3 FRIEND NAME1 : ");
        for(int i=1;i<=3;i++){
            group1.add(sc.nextLine());

        }
        System.out.println("Enter your 3 friend name : ");
        for(int i=1;i<=3;i++){
            group2.add(sc.nextLine());

        }
        HashSet<String> common = new HashSet<>(group1);
        common.retainAll(group2);
        System.out.println("Common friends name : ");
        if(common.isEmpty()){
            System.out.println("Not Common Name : ");

        }else{
            for(String name : common){
                System.out.println(name);
            }
        }

    }

}
