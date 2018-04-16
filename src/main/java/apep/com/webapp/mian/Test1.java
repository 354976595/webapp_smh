package apep.com.webapp.mian;

/**
 * Created by MACHENIKE on 2018/3/19.
 */
public class Test1 {
    static {
        System.out.println("supper static demo");
    }

    public Test1() {
        System.out.println("super constractor");
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
    }
}
class Test2 extends  Test1{
    static {
        System.out.println("child static demo");
    }

    public Test2() {
       // super();
        System.out.println("child constractor");
    }
}
