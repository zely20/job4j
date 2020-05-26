package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FlatMapTest {

    @Test
    public void matrixToListTest(){
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        FlatMap flatMap = new FlatMap();
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = flatMap.matrixToList(matrix);
        Assert.assertEquals(expected, result);
    }
}
