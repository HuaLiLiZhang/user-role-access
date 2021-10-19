package com.example.rbac.DefineAnnotation;

import lombok.Data;

/**
 * @author: Created by zhanghl
 */
@Data
public class BeanDefine {

    private String id;

    private String className;

    public BeanDefine(String id, String className) {
        this.id = id;
        this.className = className;
    }
}
