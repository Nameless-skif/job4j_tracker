package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по шоссе");
    }

    @Override
    public void numberPassengers() {
        System.out.println(getClass().getSimpleName() + " вмещает 100 человек");
    }
}
