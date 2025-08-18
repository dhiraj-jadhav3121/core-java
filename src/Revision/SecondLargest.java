package Revision;

public class SecondLargest {
    public static void main(String[] args) {

        int number[] = {20, 98, 34, 56, 10, 45};

        int largest = number[0];
        int second = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                second = largest;
                largest = number[i];

            } else if (number[i] > second && number[i] != largest) {
                second = number[i];

            }
        }
        System.out.println(second);
    }

}
