package TodayPractice30;

public class ReverseNumber12 {
    public static void main(String[] args) {
        int number=1234;
        int reversenumber = 0;
        while(number!=0){

            int digit=number%10;
            reversenumber=reversenumber*10+digit;
            number=number/10;

        }
        System.out.println("ReverseNumber ="+reversenumber);

    }
}
