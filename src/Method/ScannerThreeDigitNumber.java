package Method;

import java.util.Scanner;

public class ScannerThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int number= sc.nextInt();
        ScannerThreeDigitNumber s = new ScannerThreeDigitNumber();
        s.threeNumber(number);

    }
    public void threeNumber(int n){
        if(n>=100 && n<=999){
            System.out.println(n+"= three digit number");
        }else{
            System.out.println(n+"= NOT three digit number");
        }

    }
}
