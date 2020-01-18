package ru.avi.springLesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic1 = context.getBean(ClassicalMusic.class);
        System.out.println("sdsdsd");
        ClassicalMusic classicalMusic2 = context.getBean(ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = ClassicalMusic.getClassicalMusic();

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic1);
        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic2);
//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        MusicPlayer secondPlayer = context.getBean(MusicPlayer.class);


        context.close();
    }
}
