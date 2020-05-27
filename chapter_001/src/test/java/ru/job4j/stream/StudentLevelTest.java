package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void levelOfTest() {
        List<Student> input = List.of(new Student("Al", 25),
                null,
                new Student("Pety",28),
                new Student("Vasya", 29),
                new Student ("Igor", 23));
        List<Student> expected = List.of(
                new Student("Pety",28),
                new Student("Vasya", 29));
        StudentLevel studentLevel = new StudentLevel();
        assertThat(expected,is(studentLevel.levelOf(input,26)));
    }
}
