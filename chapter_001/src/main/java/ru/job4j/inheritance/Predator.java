package ru.job4j.inheritance;

public class Predator extends Animal {

    public Predator() {
        System.out.println("Predator default");
    }

    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }
}
