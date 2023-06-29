package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать");
    }

    @Override
    public void passenger(int numberPassengers) {
        System.out.println("Число пассажиров");
    }

    @Override
    public int refuel(int fuelQuantity) {
        return 0;
    }
}
