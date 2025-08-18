package forLoops;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int ReversedNumber =0;

        while(number!=0){

            int digit =number%10;
            ReversedNumber=ReversedNumber*10+digit;
            number /=10;

        }
        System.out.println("The Palindrome Number ="+ReversedNumber);
    }
}
