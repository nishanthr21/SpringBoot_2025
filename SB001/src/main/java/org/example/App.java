package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //to create container:
        ApplicationContext context= new ClassPathXmlApplicationContext("javaconfig.xml");
        Engine en=(Engine) context.getBean("st1");

        en.start();
    Bike b=context.getBean(Bike.class);

        b.ride();
    b.setAge(25);
        System.out.println(b.getAge());

    }
}
