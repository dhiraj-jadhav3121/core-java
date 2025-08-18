package Raugh;

public class Array {
    public static void main(String[] args) {

        int array[] = {8765,1,8, 3, 5, 7, 9, 26, 6,87};
        int largest = array[0];
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest)

                largest = array[i];

            if (array[i] < smallest)
                smallest = array[i];


        }
        System.out.println("Largest Number = "+ largest);
        System.out.println("Smallest number = "+ smallest);

    }
}
