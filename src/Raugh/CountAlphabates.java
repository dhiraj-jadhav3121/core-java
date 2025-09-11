package Raugh;

public class CountAlphabates {
    public static void main(String[] args) {

        String name = "dhiraj3121";

        String alphabates ="";
        String digit="";

        int alphabatescount = 0;
        int digitcount = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);


            if(ch >='a' && ch<='z' || ch>='A' && ch<='Z'){
                alphabates = alphabates+ch;
                alphabatescount++;

            }else if(ch >= '0' && ch <= '9'){
                digit=digit+ch;
                digitcount++;
            }

        }
        System.out.println( "Alphabates in the String = "+alphabates);
        System.out.println("Digit In the String = "+digit);

        System.out.println("alphabates count = " + alphabatescount);
        System.out.println("digit count = "+digitcount);


    }
}
