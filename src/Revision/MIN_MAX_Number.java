package Revision;

public class MIN_MAX_Number {
    public static void main(String[] args) {
        int number[] = {20, 80, 36, 90, 21, 45};

        int maximum = number[0];
        int minimum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) {
                maximum = number[i];

                if (number[i] < minimum) {
                    minimum = number[i];
                }
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
