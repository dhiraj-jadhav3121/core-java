package homeworkArray;


public class frequencyArray {
    public static void main(String[] args) {
        int numbers[] = {1,1,1,1,1,2,2,2,23,3,33,3};
        boolean digit[] = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (digit[i] == false) {
                int count = 1;

                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        digit[j] = true;
                    }
                }
                System.out.println(numbers[i] + ":" + count);
            }
        }
    }

}

