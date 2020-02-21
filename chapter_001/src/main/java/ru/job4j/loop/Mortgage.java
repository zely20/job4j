package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int result = 1;
        double dept = amount + (amount * (percent / 100));
        dept -= salary;
        while (dept > 0) {
            dept = dept + (dept * (percent / 100));
            dept -= salary;
            result++;
        }
        return result;
    }
}
