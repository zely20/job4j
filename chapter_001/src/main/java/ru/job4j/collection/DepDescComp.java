package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] firstSplit = o1.split("/");
        String[] secondSplit = o2.split("/");
        int result = secondSplit[0].compareTo(firstSplit[0]);
        return result == 0 ? o1.compareTo(o2) : result;
    }
}
