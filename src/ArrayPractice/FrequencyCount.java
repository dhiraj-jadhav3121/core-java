package ArrayPractice;

public class FrequencyCount {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 4, 3, 1, 2, 4, 23, 4, 5};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(numbers[i] + " " + count);
                count = 0;

            }


        }
    }
}
