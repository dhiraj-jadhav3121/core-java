package polymorphisam;

public class MethodOverLoading extends MethodOverRiding {


    public void add(int a, int b) {
        int c = 90;
        int sum = a + b + c;

        System.out.println(sum);

    }


    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.add(20, 60);

    }
}
