package IMP;

public class FactorialNumber {
    public static void main(String[] args) {

        int number = 5;
        int digit = 1;

        for (int i = 1; i <= number; i++) {
            digit = digit * i;
        }
        System.out.println("factorial of " + number + "is" + "=" + digit);
    }
}
