package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int limit = Math.min(o2.length(), o1.length());
        for (int j = 0; j < 2 ; j++) {
            int result = Character.compare(o2.charAt(j), o1.charAt(j));
            if (result != 0 ) {
                return result;
            }
        }
        for (int i = 3; i < limit ; i++) {
            int result = Character.compare(o1.charAt(i), o2.charAt(i));
            if (result != 0 ) {
                return result;
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}