package apep.com.webapp.ThreadTest;

/**
 * Created by MACHENIKE on 2017/11/22.
 */
public class Main {
    private int sum = 10;

    public static void main(String[] args) throws InterruptedException {

        Calculator calculator1 = new Calculator(10);
        Thread thread1 = new Thread(calculator1, "Thread A");
        Thread thread2 = new Thread(calculator1, "Thread B");
        Thread thread3 = new Thread(calculator1, "Thread C");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
