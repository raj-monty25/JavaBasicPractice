import java.io.InterruptedIOException;

public class Test1 implements Runnable {


    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Test1());
        t.start();
        System.out.printf("%d", 1);
        t.join();
        System.out.printf("%d", 2);
    }

    @Override
    public void run() {
        System.out.printf("%d", 3);
    }
}
