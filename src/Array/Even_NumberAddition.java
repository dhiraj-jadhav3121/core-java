package Array;

public class Even_NumberAddition {
    //1. WAP to find sum of all even numbers of the array.


    public static void main(String[] args) {
        int evenNumber[] = {12, 15, 18, 45};
        int sum = 0;


        for (int i = 0; i < evenNumber.length; i++) {

            if (evenNumber[i] % 2 == 0) {
                sum = sum + evenNumber[i];
            }

        }
        System.out.println(sum);

    }
}
