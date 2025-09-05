package Core_java;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int reverseNumber = 0;
        int temp = number;
        while(number !=0){
            int digit = number%10;
            reverseNumber= reverseNumber*10+digit;
            number = number/10;

        }
        if (reverseNumber==number){
            System.out.println(temp+ " = The Number is Palindrome  ");
        }
        else {
            System.out.println(temp+ " = the number is not palindrome ");
        }
    }
}
