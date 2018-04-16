package apep.com.webapp.mian;

import apep.com.webapp.aop.AopTest;
import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MACHENIKE on 2017/12/20.
 */
public class mian {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("aop.xml");
        AopTest aopTest= (AopTest) ap.getBean("aoptest");
        aopTest.testAop();

    }
}
