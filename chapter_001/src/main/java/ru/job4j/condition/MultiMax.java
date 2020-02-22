package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int temp = first > second ? first : second;
        int result = third > temp  ? third : temp;
        return result;
    }
}
