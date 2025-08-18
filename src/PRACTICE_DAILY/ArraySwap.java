package PRACTICE_DAILY;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {

        int[] array = {8, 6, 2, 1, 3, 4, 9, 5};

        // sort array in ascending/Descending order

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }
            }

        }

        System.out.println(Arrays.toString(array));


    }
}
