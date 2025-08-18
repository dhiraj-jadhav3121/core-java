package PracticLoop;

public class FibonacisSeries {
    public static void main(String[] args) {

        int first=0;
        int second=1;
        for(int i =2;i<=10;i++){

            int next = first+second;
            first=second;
            second=next;
            System.out.print(next+" ");
        }
    }
}
