package practiceOops;

public interface CustomInterface {

    public void test();

    public void relax();

    default void doNothing() {
        System.out.println("Test method");
    }


    public static void doNothing(int a) {
        System.out.println("Test method");
    }

}
