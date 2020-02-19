package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int temp;
        int result = third > (temp = first > second ? first : second) ? third : temp;
        return result;
    }
}
