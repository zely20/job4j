package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Alex";
        names[1] = "Oleg";
        names[2] = "Tanya";
        names[3] = "Olga";
        System.out.println(Arrays.toString(names));
    }
}
