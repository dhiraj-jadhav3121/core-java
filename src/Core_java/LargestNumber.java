package Core_java;

public class LargestNumber {
    public static void main(String[] args) {
        int number[] = {3, 2, 1, 5, 6, 7};
        int largest = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        System.out.println(largest);
    }
}
