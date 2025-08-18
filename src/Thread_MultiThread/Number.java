package Thread_MultiThread;

public class Number implements Runnable {
    @Override
    public void run() {

        String number = "123456789";
        try {
            for (int i = 1; i < number.length(); i++) {
                System.out.println(i);
                Thread.sleep(1000);


            }
        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
        Thread t3 = new Thread(n);


        t1.start();
        t2.start();
        t3.start();


    }
}


