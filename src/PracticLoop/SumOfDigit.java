package PracticLoop;

public class SumOfDigit {
    public static void main(String[] args) {
        int number =12344;
        int sum = 0;
        while(number!=0){

            int digit = number%10;
            number = number/10;
            sum=sum+digit;

        }

        System.out.println(sum);

    }
}
