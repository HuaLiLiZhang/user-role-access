package com.example.rbac.IOCInplement;

/**
 * @author: Created by zhanghl
 */
public class DBAppender implements Appender{

    @Override
    public void write(String msg) {
        // TODO Auto-generated method stub
        System.out.println("数据库记录 " + msg);
    }
}
