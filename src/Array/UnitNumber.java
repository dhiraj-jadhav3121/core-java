package Array;

public class UnitNumber {
    public static void main(String[] args) {

        int number[] = {123, 11, 124, 345, 12};
        for (int i = 0; i < number.length; i++) {
            int UnitPlace = number[i] % 10;
            System.out.println(UnitPlace);

        }
    }
}
