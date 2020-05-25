package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMap {

    static List<List<Integer>> matrix = List.of(
            List.of(1, 2, 3, 4),
            List.of(5, 7, 9, 10)
    );

    public static void main(String[] args) {
        System.out.println(
                matrix.stream().flatMap(List::stream).collect(Collectors.toList()));
    }
}
