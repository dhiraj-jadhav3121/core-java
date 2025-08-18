package MixPractice;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 171;
        int ReverseNumber =0;
        int OriginalNumber=number;
        while(number !=0){
            int digit = number%10;
            ReverseNumber=ReverseNumber*10+digit;
            number =number/10;

        }if(OriginalNumber==ReverseNumber){
            System.out.println("the number is palindrome  =" + OriginalNumber);

        }else{
            System.out.println("the number is not Palindrome =" + OriginalNumber);
        }

        }
    }




