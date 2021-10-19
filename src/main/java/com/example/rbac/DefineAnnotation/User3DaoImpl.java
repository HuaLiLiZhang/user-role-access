package com.example.rbac.DefineAnnotation;

import org.springframework.stereotype.Repository;

/**
 * @author: Created by zhanghl
 */
@Repository
public class User3DaoImpl {
    String name;

    public void show3() {
        System.out.println("这里是dao3方法......");
    }
}
