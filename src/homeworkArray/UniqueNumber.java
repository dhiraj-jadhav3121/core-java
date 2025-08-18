package homeworkArray;


import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {

        int num[] = {1, 2, 3, 2, 1, 4, 5, 3, 6};
        for (int i = 0; i < num.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < num.length; j++) {
                if (i != j && num[i] == num[j]) {
                    isUnique = false;


                }
            }
            if (isUnique) {
                System.out.println("unique element is = " + num[i] + " ");
            }

        }

    }
}

