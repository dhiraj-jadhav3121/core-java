package FinalCoreJavaPractice;

public class FactorialNumber {
    public static void main(String[] args) {

        //Find the Factorial of a Number Using Recursion

        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
