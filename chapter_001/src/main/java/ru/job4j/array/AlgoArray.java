package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int i = 1; i < array.length; i++) {
            if(i > i-1) {
                int temp = array[i - 1]; // переменная для временного хранения значение ячейки с индексом 0.
                array[i-1] = array[i]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
                array[i] = temp;
            }
        }


        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
