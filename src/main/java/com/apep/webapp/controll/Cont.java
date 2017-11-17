package com.apep.webapp.controll;

import com.apep.webapp.dao.LoginDao;
import com.apep.webapp.po.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
    public List<LoginEntity> getList() {
        return list;
    }

    public void setList(List<LoginEntity> list) {
        this.list = list;
    }

    @RequestMapping("/test")
    public String test() {

       list= (List<LoginEntity>) hibernateTemplate.find("from LoginEntity");
        System.out.println(list.size());
        System.out.println("size"+loginDao.getLis().size());
        return "second";
    }
}
