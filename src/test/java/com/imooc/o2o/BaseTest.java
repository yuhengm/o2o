package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class is used to incorporate Spring with Junit.
 * When JUnit runs, it will automatically load Spring IOC Containers.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// tell JUnit where to find the Spring configuration file
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class BaseTest {
}
