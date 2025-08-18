package Array;


public class EvenOddNumbers {
    public static void main(String[] args) {
       int numbers[] = {20,43,66,87,12,46,};
        for (int i = 0; i < numbers.length; i++) {

        }
        System.out.println("even number are : ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);

            }

        }
        System.out.println("odd numbers are :");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println(numbers[i]);


            }
        }

    }
}