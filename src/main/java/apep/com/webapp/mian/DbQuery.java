package apep.com.webapp.mian;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by MACHENIKE on 2018/3/19.
 */
 interface DbQuery {
    String request();

}
class Dbquer implements  DbQuery{

    @Override
    public String request() {
        System.out.println("real implement");
        return "";
    }

}

class ProxDbQuer implements InvocationHandler{
private DbQuery query;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(null==query){
            query=new Dbquer();
        }

        return query.request();

    }

}


