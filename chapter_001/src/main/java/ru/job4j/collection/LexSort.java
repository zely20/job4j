package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String [] leftArray = left.split(".",2);
        String [] rightArray = left.split(".",2);
        int leftInt = Integer.parseInt(leftArray[0]);
        int rightInt = Integer.parseInt(rightArray[0]);
        return Integer.compare(leftInt, rightInt);
    }
}
