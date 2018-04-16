package apep.com.webapp.ThreadTest;

/**
 * Created by MACHENIKE on 2017/11/22.
 */
public class ThreadTest1 implements  Runnable {
    @Override
    public void run() {
        for (int i=1;i<=123;i++){
            try {
                System.out.println(i+Thread.currentThread().getName());
                Thread.currentThread().sleep(300);
                while (i==55){
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("thread is interrupt");
            }
        }
    }
}
