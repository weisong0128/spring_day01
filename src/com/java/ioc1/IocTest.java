package com.java.ioc1;

import com.java.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/24 12:36
 */
public class IocTest {
    public static void main(String[] args) {
        //Dog dog = new Dog();    applicationContext.xml
        //启动spring框架,核心类：ClassPathXmlApplicationComtext,其接口：ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中取出创建的dog对象
       Dog smallDog1 = context.getBean("smallDog", Dog.class);//一个参数默认是以Object类型返回，加第二个参数可以指定返回Dog类型
//       Dog smallDog2 = context.getBean("smallDog", Dog.class);
        smallDog1.eat();
//        System.out.println(smallDog1);
//        System.out.println(smallDog2);

        //关闭spring容器
        //ClassPathXmlApplicationContext类中有close方法，但是AplicationContext接口中没有定义close方法
        //将context对象强转为ClassPathXmlApplicationContext类型
        ((ClassPathXmlApplicationContext)context).close();

    }
}
