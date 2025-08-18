package FinalCoreJavaPractice;

public class SwapNumber {
    public static void main(String[] args) {

        //Swap two numbers without using a third variable.

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a =" + a + " b=" + b);
    }
}
