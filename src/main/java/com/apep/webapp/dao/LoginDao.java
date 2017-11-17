package com.apep.webapp.dao;

import com.apep.webapp.po.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MACHENIKE on 2017/11/16.
 */
@Repository
public class LoginDao {
@Autowired
    private  HibernateTemplate hibernateTemplate;
    public List<LoginEntity> getLis()
    {

        return (List<LoginEntity>) hibernateTemplate.find("from LoginEntity");
    }


}
