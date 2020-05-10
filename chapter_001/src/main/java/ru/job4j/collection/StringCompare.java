package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int limit = Math.min(left.length(), right.length());
        for (int i = 0; i < limit ; i++) {
            int result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0 ) {
                return result;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
