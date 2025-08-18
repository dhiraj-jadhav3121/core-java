package practiceOops;

@FunctionalInterface
public interface CustomInterface2 {

    public void work();


    default void doNowwwthing() {
        System.out.println("Test method");
    }

    default void dddddd() {
        System.out.println("Test method");
    }


    public static void doNothinwwg(int a) {
        System.out.println("Test method");
    }


    public static void doNojjjkkthinwwg(int a) {
        System.out.println("Test method");
    }
}
