package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static List<Integer> matrixToList(List<List<Integer>> matrix) {
              return matrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(matrixToList(matrix));
    }
}
