package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int limit = left.length() < right.length() ? left.length() : right.length();
        for (int i = 0; i < limit ; i++) {
            int result = left.charAt(i) - right.charAt(i);
            if (result != 0 ) {
                return result;
            }
        }
        return left.length() - right.length();
    }
}
