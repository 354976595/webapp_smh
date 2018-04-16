package apep.com.webapp.mian;

import java.lang.reflect.Proxy;

/**
 * Created by MACHENIKE on 2018/3/19.
 */
public class M {
    public static DbQuery createProxy(){
        DbQuery proxy = (DbQuery) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), new Class[]{DbQuery.class}, new ProxDbQuer()
        );
        return proxy;
    }

    public static void main(String[] args) {
        createProxy().request();
    }
}
