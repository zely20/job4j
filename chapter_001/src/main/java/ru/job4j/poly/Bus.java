package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Везем пасажиров " + passengers);
    }

    @Override
    public double refuel(int quantity) {
        double price = 2.2;
        return quantity*price;
    }
}
