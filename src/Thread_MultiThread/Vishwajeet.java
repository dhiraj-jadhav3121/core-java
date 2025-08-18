package Thread_MultiThread;

public class Vishwajeet implements Runnable {
    @Override
    public void run() {

        String name = "Dhiraj";
        try {

            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                System.out.println(ch);
                Thread.sleep(2000);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
       Vishwajeet v1 = new Vishwajeet();

       Thread t1 = new Thread(v1);

       t1.start();



    }
}
