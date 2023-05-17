package com.seleniumexpress.classrefer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");

        Student student=context.getBean("student", Student.class);
        AnotherStudent anotherStudent=context.getBean("anotherStudent", AnotherStudent.class);

        student.startCheating();
        anotherStudent.startCheating();
    }
}
