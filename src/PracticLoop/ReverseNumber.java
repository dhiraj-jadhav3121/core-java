package PracticLoop;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 97671477;

        int ReversedNumber = 0;

        while (number != 0) {

            int digit = number % 10;
            ReversedNumber = ReversedNumber * 10 + digit;

            number = number / 10;

        }
        System.out.println(ReversedNumber);
    }
}
