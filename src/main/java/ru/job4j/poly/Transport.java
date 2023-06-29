package ru.job4j.poly;

public interface Transport {
    void  drive();

    void passenger(int numberPassengers);

    int refuel(int fuelQuantity);
}
