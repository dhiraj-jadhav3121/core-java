package PRACTICE_DAILY;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;


        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + "  " + "b=" + b);


        a = a + b;//22
        b = a - b;//10
        a = a - b;//12
        System.out.println("a=" + a + "  " + "b=" + b);

    }
}
