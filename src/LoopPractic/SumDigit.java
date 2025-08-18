package LoopPractic;

public class SumDigit {
    public static void main(String[] args) {
        int sum= 0;
        int number =3453;
        while(number!=0){
            int digit=number%10;
            number =number/10;
            sum=sum+digit;
        }
        System.out.println(sum);
    }
}
