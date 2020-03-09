package ru.job4j.inheritance;

public class Tiger extends Predator {

    public Tiger() {
        System.out.println("Tiger default");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }
}
