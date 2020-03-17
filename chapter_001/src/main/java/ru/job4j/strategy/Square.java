package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder string  = new StringBuilder();
        string.append("++++++" + System.lineSeparator());
        string.append("+    +" + System.lineSeparator());
        string.append("+    +" + System.lineSeparator());
        string.append("+    +" + System.lineSeparator());
        string.append("+    +" + System.lineSeparator());
        string.append("++++++" + System.lineSeparator());
        return string.toString();
    }
}
