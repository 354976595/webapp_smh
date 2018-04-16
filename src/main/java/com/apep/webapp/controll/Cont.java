package com.apep.webapp.controll;

import apep.com.webapp.po.InnerClass2;
import apep.com.webapp.po.Outer;
import apep.com.webapp.po.SuceessData;
import com.apep.webapp.dao.LoginDao;
import com.apep.webapp.po.LoginEntity;
import com.apep.webapp.po.TestValue;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by MACHENIKE on 2017/11/16.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Controller
public class Cont {
    private List<LoginEntity> list;

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Autowired
    private  LoginDao loginDao;
    @Autowired
    private TestValue testValue;
    public List<LoginEntity> getList() {
        return list;
    }

    public void setList(List<LoginEntity> list) {
        this.list = list;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {

//       list= (List<LoginEntity>) hibernateTemplate.find("from LoginEntity");
//        System.out.println(list.size());
//        System.out.println("size"+loginDao.getLis().size());
        Gson g=new Gson();
        LoginEntity entiry=new LoginEntity();
        entiry.setName("xjd");
        entiry.setPassword("32131");
        String json= g.toJson(entiry);
        System.out.println(json);
//        return json;
        return "{\"haha\":\"hjk\"}";
    }
    @RequestMapping("/jsonError")
    @ResponseBody
    public String test1(){
        Gson g=new Gson();
        Outer outer=new Outer("faile",null,new InnerClass2("errorCode","errorMesssage"));
        return g.toJson(outer);
    }@RequestMapping("jsonSuccess")
    @ResponseBody
    public String test2(){
        Gson g=new Gson();
        Outer outer=new Outer(new SuceessData(true,new InnerClass2(null,null),"test2","cerNO","loanAmt"));
        return g.toJson(outer);
    }
    @RequestMapping("voidTest")
    @ResponseBody
    public void test3(HttpServletResponse response)   {
        try{
            Gson g=new Gson();
            System.out.println("log1="+testValue.logValue1+"\t"+testValue.getLogValue2());
            Outer outer=new Outer(new SuceessData(true,new InnerClass2(null,null),"test3","cerNO","loanAmt"));
            response.getWriter().print(g.toJson(outer));
        }
        catch (Exception e){
            this.test2();
        }
    }
    @RequestMapping(value = "/pathValue/{str1}/{str2}")
    @ResponseBody
    public String test4(@PathVariable(value = "str1")String str1,@PathVariable(value = "str2")String str2){
        Outer outer=new Outer("faile",null,new InnerClass2("errorCode","errorMesssage"));
        System.out.println("str1="+str1+"str2="+str2);
        return this.test2();
    } @RequestMapping(value = "/pathValue/{str2}")
    @ResponseBody
    public void test5(@PathVariable(value = "str2")String str2){
        System.out.println(str2.toString());
    }
}
