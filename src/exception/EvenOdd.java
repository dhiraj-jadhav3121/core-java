package exception;

public class EvenOdd {
    public static void main(String[] args) {

        int number = 11;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            throw new ErrorThrowing(MessageFormater.format(
                    "Failed",
                    "404",
                    "www.google.com",
                    500));
        }
    }
}
