package Collection;

import java.util.HashSet;

public class FriendsName {
    public static void main(String[] args) {

        HashSet<String> Friends = new HashSet<>();

        Friends.add("DHIRAJ");
        Friends.add("MANOJ");
        Friends.add("ROHIT");
        Friends.add("ADITYA");
        Friends.add("OMKAR");
        System.out.println("My Freinds : "+Friends);

        if(Friends.contains("MANOJ")){

            System.out.println(" Manoj is my friend.");
        }else{
            System.out.println(" Manoj is Not my friend.");

        }
        System.out.println("Total Friends : "+Friends.size());



    }
}
