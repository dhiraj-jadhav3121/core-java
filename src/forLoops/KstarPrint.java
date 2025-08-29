package forLoops;


public class KstarPrint {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print("*");

            for (int j = 0; j < n; j++) {

                if (j == n - i - 1 && i <= n / 2) {
                    System.out.print("*");

                } else if (j == i && i > n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
