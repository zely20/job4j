package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int indexLength = left.length() - right.length();
        if (indexLength == 0) {
            for (int i = 0; i < left.length(); i++) {
                int result = left.charAt(i) - right.charAt(i);
                if (result != 0) {
                    return result;
                }
            }
        } else if (indexLength < 0) {
            for (int i = 0; i < left.length(); i++) {
                int result = left.charAt(i) - right.charAt(i);
                if (result != 0) {
                    return result;
                }
            }
            return -1;
        } else {
            for (int i = 0; i < right.length(); i++) {
                int result = left.charAt(i) - right.charAt(i);
                if (result != 0) {
                    return result;
                }
            }
            return 1;
        }
        return 0;
    }
}
