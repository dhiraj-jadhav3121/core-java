package practiceOops;

public abstract class AbstractionClass {

    public abstract void start();

    public abstract void stop();

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

}
