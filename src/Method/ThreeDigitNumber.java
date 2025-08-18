package Method;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        ThreeDigitNumber t= new ThreeDigitNumber();
        int number =123;
        t.ThreeDigit(number);



    }
    public void ThreeDigit(int n){
        if(n>=100 && n<=999){
            System.out.println(n +"= number is three Digit");
        }else{
            System.out.println(n + "= number is NOT three Digit");
        }
    }
}
