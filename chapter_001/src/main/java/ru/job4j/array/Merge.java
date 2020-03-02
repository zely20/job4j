package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexA >= left.length) {
                rsl[i] = right[indexB];
                indexB++;
            } else if (indexB >= right.length) {
                rsl[i] = left[indexA];
                indexA++;
            } else if (left[indexA] < right[indexB]) {
                rsl[i] = left[indexA];
                indexA++;
            } else {
                rsl[i] = right[indexB];
                indexB++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5, 6},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
