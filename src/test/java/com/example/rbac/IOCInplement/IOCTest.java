package com.example.rbac.IOCInplement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: Created by zhanghl
 */
public class IOCTest {
    @Test
    public void test() {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        UserService us = (UserService)factory.getBean("UserService");
        PowerService ps = (PowerService)factory.getBean("PowerService");
        us.save();
        us.update();
        ps.save();
        ps.update();
    }
}
