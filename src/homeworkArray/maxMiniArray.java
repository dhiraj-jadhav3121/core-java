package homeworkArray;

public class maxMiniArray {
    public static void main(String[] args) {
        int numbers[] = {12, 23, 54, 67, 98, 10};
        int max = numbers[0];
        int mini = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < mini) {
                mini = numbers[i];

            } else if (numbers[i] > max) {
                max = numbers[i];

            }

        }
        System.out.println("minimum numbers : " + mini);
        System.out.println("maximum numbers : " + max);
    }
}
