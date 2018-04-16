package apep.com.webapp.mian;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by MACHENIKE on 2018/3/6.
 */
public class WE {
    public static void main(String[] args) {
int s[]=s(new int[]{1,2,5,4,3,32,0,8});
        for (int i : s) {
            System.out.println(i);
        }
    }


    private  static  int[] s(int[] s1){
       for(int i=0;i<s1.length;i++){
           for(int j=0;j<s1.length-1;j++){
               if(s1[i]<s1[j]){
                   int c=0;
                  c= s1[i];
                   s1[i]=s1[j];
                   s1[j]=c;
               }

           }

       }
        return  s1;





    }


}class Outer{
    private String outValue;
    private List<Second> second;

    public String getOutValue() {
        return outValue;
    }
@Deprecated
@SuppressWarnings(value = "232131")
    public void setOutValue(String outValue) {
        this.outValue = outValue;
    }

    public List<Second> getSecond() {
        return second;
    }

    public void setSecond(List<Second> second) {
        this.second = second;
    }
}
class Second{
    private String secondValue;
    private List<Thrid> lIst;
}
class Thrid{
    private String thridVlue;
    private List<String> stringList;

}
