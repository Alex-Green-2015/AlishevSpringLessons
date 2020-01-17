package ru.avi.springLesson2;

public class MyBean extends TestBean{

    private String row;

    MyBean(String row) {
        super("Jersy");
        this.row = row;
    }


    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
}
