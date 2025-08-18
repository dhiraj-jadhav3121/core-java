package ArrayPractice;

public class Max_MIN_Numbers {
    public static void main(String[] args) {

        // Find the Largest and Smallest Element in Array...

        int numbers[] = {12, 43, 54, 65, 86};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];

            if (numbers[i] > max)
                max = numbers[i];


        }
        System.out.println("minimum numbers : " + min);
        System.out.println("maximun numbers : " + max);

    }
}

