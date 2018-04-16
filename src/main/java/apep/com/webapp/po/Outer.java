package apep.com.webapp.po;

/**
 * Created by MACHENIKE on 2018/4/9.
 */
public class Outer {
    private  String decode;
    private  Object date;
    private  InnerClass2 class2;

    public Outer(Object date) {
        this.decode="success";
        this.date = date;
    }

    public Outer(String decode, Object date, InnerClass2 class2) {
        this.decode = decode;
        this.date = date;
        this.class2 = class2;
    }

    @Override
    public String toString() {
        return "Outer{" +
                "decode='" + decode + '\'' +
                ", date=" + date +
                ", class2=" + class2 +
                '}';
    }

    public String getDecode() {
        return decode;
    }

    public void setDecode(String decode) {
        this.decode = decode;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public InnerClass2 getClass2() {
        return class2;
    }

    public void setClass2(InnerClass2 class2) {
        this.class2 = class2;
    }
}
