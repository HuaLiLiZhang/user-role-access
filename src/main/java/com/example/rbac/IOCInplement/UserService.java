package com.example.rbac.IOCInplement;

/**
 * @author: Created by zhanghl
 */
public class UserService {
    private Appender appender;

    public void setAppender(Appender appender) {
        this.appender = appender;
    }
    public void save()
    {
        appender.write("保存用户");
    }
    public void update()
    {
        appender.write("更新用户！");
    }
}
