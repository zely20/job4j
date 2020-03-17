package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder string  = new StringBuilder();
        string.append("   +   " + System.lineSeparator());
        string.append("  + +  " + System.lineSeparator());
        string.append(" +   + " + System.lineSeparator());
        string.append("+++++++" + System.lineSeparator());
        return string.toString();
    }
}
