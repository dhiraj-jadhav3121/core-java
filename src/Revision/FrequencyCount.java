package Revision;

public class FrequencyCount {
    public static void main(String[] args) {
        int number[] = {1, 3, 4, 6, 7, 2, 34, 5, 1, 3, 4, 2};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {

                if (number[i] == number[j]) {
                    count++;
                    if (count == 1) {
                        System.out.println(number[i]+"="+count);
                        count=0;

                    }

                }

            }
        }
    }
}
