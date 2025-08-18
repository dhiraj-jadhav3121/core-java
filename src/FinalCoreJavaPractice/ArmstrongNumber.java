package FinalCoreJavaPractice;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Check Armstrong number

        int number = 153;
        int result = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            result = result + digit * digit * digit;
            number = number / 10;



        }
        if (result == original) {
            System.out.println(original + " is Armstrong number");
        } else {
            System.out.println(original + "is NOT Armstrong number");
        }

    }

}