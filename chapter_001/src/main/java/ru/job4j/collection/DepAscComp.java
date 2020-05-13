package ru.job4j.collection;

import java.util.Comparator;

public class DepAscComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int limit = Math.min(o1.length(), o2.length());
        for (int i = 0; i < limit ; i++) {
            int result = Character.compare(o1.charAt(i), o2.charAt(i));
            if (result != 0 ) {
                return result;
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}