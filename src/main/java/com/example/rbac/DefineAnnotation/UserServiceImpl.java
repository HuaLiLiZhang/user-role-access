package com.example.rbac.DefineAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Created by zhanghl
 */
@Service
public class UserServiceImpl {
    public UserServiceImpl(){
        System.out.println("UserServiceImpl 初始化。。。");
    }

    @Autowired
    public UserDaoImpl userDao;

    public User1DaoImpl user1Dao;

    @MyResource(name = "user3Dao")
    public User3DaoImpl user3Dao;

    @MyResource
    public User2DaoImpl user2Dao;

    // set方法上的注解，带有name属性
    /*@MyResource(name = "userDao")
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }*/

    /**
     * 如果注解ZxfResource配置了name属性，则根据name所指定的名称获取要注入的实例引用，
     * 如果注解ZxfResource;没有配置name属性，则根据属性所属类型来扫描配置文件获取要
     * 注入的实例引用
     **/


    // set方法上的注解，没有配置name属性
    @MyResource
    public void setUser1Dao(User1DaoImpl user1Dao) {
        this.user1Dao = user1Dao;
    }

    public void show() {
        userDao.show();
        user1Dao.show1();
        user2Dao.show2();
        System.out.println("这里是Service方法........");
    }

    public void showDao() {
        userDao.show();
        System.out.println("这里是Service方法........");
    }
    public void showDao3() {
        user3Dao.show3();
        System.out.println("这里是Service方法........");
    }

    public void showDao12() {
        user1Dao.show1();
        user2Dao.show2();
        System.out.println("这里是Service方法........");
    }

}
