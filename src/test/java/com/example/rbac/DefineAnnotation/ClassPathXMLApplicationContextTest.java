package com.example.rbac.DefineAnnotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Created by zhanghl
 */
@SpringBootTest
public class ClassPathXMLApplicationContextTest {
    @Test
    public void test() {
        ClassPathXMLApplicationContext path = new ClassPathXMLApplicationContext(
                "applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) path.getBean("userService");
        userService.show();
    }

    @Autowired
    UserServiceImpl userServiceAutowired;

    @Test
    public void testNoXml() {
        ClassPathXMLApplicationContext path = new ClassPathXMLApplicationContext(
                "applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) path.getBean("userService");
        userService.showDao12();
        userService.showDao3();
        userServiceAutowired.showDao();
    }
}
