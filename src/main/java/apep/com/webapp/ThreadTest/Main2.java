package apep.com.webapp.ThreadTest;

/**
 * Created by MACHENIKE on 2017/11/23.
 */
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 threadTest1=new ThreadTest1();
        Thread thread1=new Thread(threadTest1,"thread1");
        thread1.start();
        thread1.join(2000);
        System.out.println(12212321);

    }
}
