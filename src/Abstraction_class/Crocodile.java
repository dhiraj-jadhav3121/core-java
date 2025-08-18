package Abstraction_class;

public abstract class Crocodile implements Animal {
    @Override
    public void run() {
        System.out.println("run but not faster than tiger");

    }
    public  abstract void jump();
}
