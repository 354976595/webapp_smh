package com.apep.webapp.po;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

/**
 * Created by MACHENIKE on 2017/11/16.
 */
@Entity
@Table(name = "login")
public class LoginEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "loginName")
    private String loginName;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "state")
    private Integer state;
    @Column(name = "testC")
    private String testc;

    public String getTestc() {
        return testc;
    }

    public void setTestc(String testc) {
        this.testc = testc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginEntity that = (LoginEntity) o;

        if (id != that.id) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
