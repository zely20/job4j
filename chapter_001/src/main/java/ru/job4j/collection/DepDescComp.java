package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = splitArray(o2)[0].compareTo(splitArray(o1)[0]);
        return result == 0 ? o1.compareTo(o2) : result;
    }

    private String [] splitArray (String o1) {
        String [] strings = new String[2];
        int i = 0;
        for (String val : o1.split("/", 2)){
            strings[i++] = val;
        }
        return strings;
    }
}
