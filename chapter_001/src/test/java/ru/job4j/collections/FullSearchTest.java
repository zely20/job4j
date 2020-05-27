package ru.job4j.collections;

import org.junit.Test;
import ru.job4j.collection.FullSearch;
import ru.job4j.collection.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        Set<String> expected = Set.of("1", "2");
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}
