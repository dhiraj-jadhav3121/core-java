package PracticLoop;

public class Palindrome {

    public static void main(String[] args) {

        int number = 12345;
        int reverseNumber = 0;  // 54321
        while (number > 0) {
            int digit = number % 10;   // 5 ,4
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;

        }
        System.out.println(reverseNumber);

    }
}
