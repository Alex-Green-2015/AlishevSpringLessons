package ru.avi.springLesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean myTest = context.getBean(MyBean.class);
        MyBean myNew = context.getBean(MyBean.class);
        myNew.setName("343434");
        System.out.println(myNew.getRow());
        context.getBean(MyBean.class).setRow("d33d");
        System.out.println(myTest.getName());
        System.out.println(myNew.getName());
        System.out.println(myNew.getRow());
        context.getBean(MyBean.class);



        context.close();
    }
}
