package ru.green.avi.spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        ClassicalMusic classicalMusic = new ClassicalMusic();
        System.out.println("Object is created : " + classicalMusic);
        return classicalMusic;
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
