package ru.job4j.tracker.checkstyle;

public class Broken {
    private int sizeEmpty = 10;
    private String name;
    private String surname;

    private static final String NEW_VALUE = "";

    public void echo() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f) { }

    public Broken() { }

}
