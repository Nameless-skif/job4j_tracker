package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("Ivan", 30);
        System.out.println(personRecord);
        System.out.println("Имя: " + personRecord.name() + " возраст: " + personRecord.age());
    }
}
