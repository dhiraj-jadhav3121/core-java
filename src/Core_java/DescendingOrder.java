package Core_java;

public class DescendingOrder {
    public static void main(String[] args) {
        int number[] = {9, 6, 4, 2, 3, 1, 6, 5, 7, 8};
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {

                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;

                }

            }
        }
        System.out.println("Array in DescendingOrder : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
