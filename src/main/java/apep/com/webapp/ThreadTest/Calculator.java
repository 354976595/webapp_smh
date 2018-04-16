package apep.com.webapp.ThreadTest;

/**
 * Created by MACHENIKE on 2017/11/22.
 */
public class Calculator implements  Runnable {
    private int con;
    public Calculator(int con) {
        this.con=con;
    }

    @Override
    public void run() {
       synchronized (this){
        try {

            System.out.println("currentThread" + Thread.currentThread().getName()+ "\t剩余：" + this.con);
            con--;
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       }
    }
}