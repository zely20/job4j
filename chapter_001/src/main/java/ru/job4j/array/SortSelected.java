package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i - 1, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            int temp = data[index];
            data[index] = data[i - 1];
            data[i - 1] = temp;
        }
        return data;
    }
}
