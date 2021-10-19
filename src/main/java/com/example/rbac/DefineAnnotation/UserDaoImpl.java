package com.example.rbac.DefineAnnotation;

import org.springframework.stereotype.Repository;

/**
 * @author: Created by zhanghl
 */
@Repository
public class UserDaoImpl {
    String name;

    public void show() {
        System.out.println("这里是dao方法......");
    }
}
