package com.example.rbac.DefineAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Created by zhanghl
 */
@Retention(RetentionPolicy.RUNTIME) //@Retention可以用来修饰注解，是注解的注解，称为元注解
@Target({ElementType.FIELD, ElementType.METHOD})
//@Target说明了Annotation所修饰的对象范围：Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。在Annotation类型的声明中使用了target可更加明晰其修饰的目标。
//作用：用于描述注解的使用范围（即：被描述的注解可以用在什么地方）
public @interface MyResource {
    public String name() default "";
}
