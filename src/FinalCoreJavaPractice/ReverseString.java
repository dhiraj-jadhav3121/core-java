package FinalCoreJavaPractice;

public class ReverseString {
    public static void main(String[] args) {

        //1. Reverse a String Without Using Library Functions

        String name = "Hello";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);

    }
}
