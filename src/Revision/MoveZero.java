package Revision;


public class MoveZero {
    public static void main(String[] args) {

        int number[] = {1, 2, 0, 4, 0, 0, 2, 4, 8};
        int move = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                number[move] = number[i];
                move++;

            }
        }
        for (int i = move; i < number.length; i++) {
            number[i] = 0;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
    }
}
