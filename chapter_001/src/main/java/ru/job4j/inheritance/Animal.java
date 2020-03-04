package ru.job4j.inheritance;

public class Animal {
    String name;

    public Animal() {
        System.out.println("Animal constructor");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("constructor with one parametr");
    }

}
