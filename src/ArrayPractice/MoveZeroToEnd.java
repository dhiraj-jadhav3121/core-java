package ArrayPractice;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int numbers[] = {1, 0, 7, 0, 0, 12, 34,7,6,5};
        int move = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[move++] = numbers[i];
            }
        }
        for (int i = move; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}
