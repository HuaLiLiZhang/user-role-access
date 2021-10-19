package com.example.rbac.IOCInplement;

/**
 * @author: Created by zhanghl
 */
public class PowerService {
    private Appender appender;

    public void save() {
        // TODO Auto-generated method stub
        appender.write("保存数据");
    }

    public void update() {
        // TODO Auto-generated method stub
        appender.write("修改数据");
    }

    public void setAppender(Appender appender) {
        this.appender = appender;
    }
}
