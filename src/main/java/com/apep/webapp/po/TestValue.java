package com.apep.webapp.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by MACHENIKE on 2018/4/10.
 */
@Component
public class TestValue {
    @Value("${log4j.appender.logfile.File}")
    public String logValue1;
    @Value("${log4j.appender.logfile.layout}")
    public String logValue2;

    public String getLogValue1() {
        return logValue1;
    }

    public void setLogValue1(String logValue1) {
        this.logValue1 = logValue1;
    }

    public String getLogValue2() {
        return logValue2;
    }

    public void setLogValue2(String logValue2) {
        this.logValue2 = logValue2;
    }

    @Override
    public String toString() {
        return "TestValue{" +
                "logValue1='" + logValue1 + '\'' +
                ", logValue2='" + logValue2 + '\'' +
                '}';
    }
}
