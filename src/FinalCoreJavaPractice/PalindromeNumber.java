package FinalCoreJavaPractice;

public class PalindromeNumber {
    public static void main(String[] args) {

        //4. Check if a String is a Palindrome

        int number = 121;
        int reverse = 0;
        int Original = number;
        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;


        }
        if (reverse == Original) {
            System.out.println(reverse + "  is palindrome Number ");
        } else {
            System.out.println(reverse + "  is not palindrome Number ");
        }

    }
}
