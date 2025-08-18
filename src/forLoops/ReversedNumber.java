package forLoops;

public class ReversedNumber {
    public static void main(String[] args) {
        int number= 121;
        int OriginalNumber=number;
        int ReversedNumber = 0;

        while(number!=0){

            int digit= number%10;
            ReversedNumber=ReversedNumber*10+digit;

            number/=10;

        }
        if(OriginalNumber==ReversedNumber);{
            System.out.println("palindrome number ="+ ReversedNumber);
        }
    }
    }



