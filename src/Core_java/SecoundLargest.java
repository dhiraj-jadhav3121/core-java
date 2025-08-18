package Core_java;

public class SecoundLargest {
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50};
        int largest = number[0];
        int second = -1;
        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                second = largest;
                largest = number[i];

            }
            if (number[i] > second && number[i] != largest) {
                second = number[i];

            }
        }
        System.out.println(second);
    }
}
