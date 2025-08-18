package Thread_MultiThread;

public class TwoThreadConcurrently {
    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }

}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2;i <= 20; i += 2) {
            System.out.println("Even: "+i);

        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd : " + i);
        }
    }
}
