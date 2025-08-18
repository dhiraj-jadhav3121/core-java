package Core_java;

public class Asending_Order {
    public static void main(String[] args) {
        int number[] = {5, 4, 2, 6, 7, 9, 1, 5};
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {

                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;


                }

            }

        }
        System.out.println("array in Ascending Order : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
