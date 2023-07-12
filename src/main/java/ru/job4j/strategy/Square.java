package ru.job4j.strategy;

public class Square implements Shape {
    String ln = System.lineSeparator();

    @Override
    public String draw() {
        return "---" + "---"  + ln
                + "|" + "    " + "|" + ln
                + "---" + "---";
    }
}
