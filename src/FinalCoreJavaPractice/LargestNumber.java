package FinalCoreJavaPractice;

public class LargestNumber {
    public static void main(String[] args) {

        int array[] = {43, 21, 44, 65, 89, 90};

        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("largest number in array = " + largest);

    }
}
