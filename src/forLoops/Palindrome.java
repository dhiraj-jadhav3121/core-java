package forLoops;

public class Palindrome {
    public static void main(String[] args) {

        int originalNumber = 121;
        int reversedNumber = 0;
        int number = originalNumber;


        for (; number > 0; number = number / 10) {

            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

        }


        if (reversedNumber == originalNumber) {
            System.out.println("Palindrome:" + originalNumber);
        } else {
            System.out.println("Not Palindrome: " + originalNumber);
        }

    }
}
