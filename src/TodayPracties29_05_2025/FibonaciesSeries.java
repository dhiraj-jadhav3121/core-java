package TodayPracties29_05_2025;

public class FibonaciesSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        for (int i = 2; i <= 15; i++) {

            int next = first + second;
            first = second;
            second = next;
            System.out.println(next);
            

        }


    }
}
