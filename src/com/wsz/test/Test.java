package com.wsz.test;

import com.wsz.dao.TestDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wsz
 * @className: Test
 * @description:
 * @date: 2021/6/17 21:37
 * @version: 0.1
 * @since: jdk1.8
 */
public class Test {

    /**
     * @description: Spring入门案例
     * 将dao层的实现类，在配置文件中指定类的全路径，并给定id值
     * 在测试类中，通过实现应用上下文接口，来加载自定义的配置文件
     * 获取应用上下文的实例后，通过getBean方法，加载配置文件中指定的id值，来实例该类
     * 然后调用该实现类中定义的方法
     * 运行正常，以此证明，可以不通过new运算符来创建类的对象
     * 证明，通过Spring容器，可以获取实现类的对象，
     * 即Spring IOC的工作机制
     * @param: [args]
     * @return: void
     */
    public static void main(String[] args) {
        //初始化Spring容器，加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取test实例
        TestDao test = (TestDao) context.getBean("test");//test为配置文件中指定的id
        test.sayHello();
    }
}
