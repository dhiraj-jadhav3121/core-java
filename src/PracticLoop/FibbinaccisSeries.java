package PracticLoop;

public class FibbinaccisSeries {
    public static void main(String[] args) {
        int first =0;
        int second =1;
        for(int i =2;i<=20;i++){
            int next = first+second;
            first=second;
            second=next;
            System.out.println(next);
        }
    }
}
