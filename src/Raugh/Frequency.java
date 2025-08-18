package Raugh;

public class Frequency {
    public static void main(String[] args) {


        int number[] = {1, 2, 3, 5, 1, 2, 4, 5};
        int count = 0;

        for (int i = 0; i < number.length; i++) {


            for (int j = i + 1; j < number.length; j++) {

                if (number[i] == number[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(number[i] + ":" + count);
            }


        }


    }
}
