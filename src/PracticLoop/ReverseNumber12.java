package PracticLoop;

public class ReverseNumber12 {
    public static void main(String[] args) {
        int number=56789;
       int ReverseNumber = 0;
       while(number!=0){
           int digit = number%10;
           ReverseNumber=ReverseNumber*10+digit;
           number=number/10;
       }
        System.out.println(ReverseNumber);

    }
}
