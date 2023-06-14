package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFamilyName("Nikita Semenov");
        student.setGroup(2);
        student.setEntry(new Date());
        System.out.println(student.getFamilyName() + " из группы " + student.getGroup() + " поступил " + student.getEntry());
    }
}
