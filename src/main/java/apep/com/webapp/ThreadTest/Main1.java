package apep.com.webapp.ThreadTest;

/**
 * Created by MACHENIKE on 2017/11/22.
 */
public class Main1 {
    public static void main(String[] args) {
        ThreadTest1 threadTest1=new ThreadTest1();
        Thread thread=new Thread(threadTest1,"thread1");
        thread.start();
    }
}
