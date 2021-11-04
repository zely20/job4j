package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public List<Integer> matrixToList(Integer[][] matrix) {
        List<Integer> result;
        return  result = Arrays.stream(matrix)
                .flatMap(i -> Arrays.stream(i))
                .collect(Collectors.toList());
    }
}
