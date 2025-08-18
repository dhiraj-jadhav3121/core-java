package homeworkArray;


public class SqureNumbers {
    public static void main(String[] args) {

        int numbers[] = {2, 3, 4, 9, 16, 5, 25};

        System.out.println("square number  : ");


        for (int i = 0; i < numbers.length; i++) {

            int square = numbers[i] * numbers[i];

            for (int j = 0; j < numbers.length; j++) {

                if (square == numbers[j]) {

                    System.out.println(numbers[i]);
                    break;
                }


            }


        }
    }
}
