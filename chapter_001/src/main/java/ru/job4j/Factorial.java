package ru.job4j;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = n; i > 1; i--) {
                result *= i;
            }
        }
        return result;
    }
}
