package ru.job4j.calculator;
/*
*
*  Calculator
*  @author Alexandr Zelenko zely1984@gmail.com
*
*  @version 0.1
 */

public class Calculate {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }
}
