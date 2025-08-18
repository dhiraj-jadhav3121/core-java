package PracticLoop;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
       int ReversedNumber =0;
       int OriginalNumber = number;
       while(number!=0){

           int digit = number%10;
           ReversedNumber =ReversedNumber*10+digit;
           number = number/10;

       }
       if(ReversedNumber==OriginalNumber){
           System.out.println("number are palindrome="+ OriginalNumber);
       }else{
           System.out.println("number are not palindrome="+OriginalNumber);
       }

    }
}
