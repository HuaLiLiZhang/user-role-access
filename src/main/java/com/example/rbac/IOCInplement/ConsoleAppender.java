package com.example.rbac.IOCInplement;

/**
 * @author: Created by zhanghl
 */
public class ConsoleAppender implements Appender {

    @Override
    public void write(String msg) {
        // TODO Auto-generated method stub
        System.out.println("控制台打印 "+ msg);
    }
}