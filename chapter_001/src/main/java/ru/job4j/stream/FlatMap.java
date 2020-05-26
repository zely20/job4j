package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public List<Integer> matrixToList(List<List<Integer>> matrix) {
              return   matrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
