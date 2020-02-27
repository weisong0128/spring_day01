package com.java.di2;

import com.java.pojo.DB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/25 14:41
 */
public class DITest {
    public static void main(String[] args) {
        //通过set方法
//        DB db1 = new DB();
//        db1.setDriver("xxxx");

        //通过有参构造方法
//        DB db2 = new DB("mysql", 3306, 9.9F, null);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DB db = context.getBean("smallDB", DB.class);
        System.out.println(db);
        //关闭spring容器
        ((ClassPathXmlApplicationContext)context).close();

    }
}
