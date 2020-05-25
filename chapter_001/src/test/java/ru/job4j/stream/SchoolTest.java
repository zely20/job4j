package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void a() {
        List<Student> input = List.of(new Student("Alex", 10),
                new Student("Ivan", 60),
                new Student("Vasya", 90)
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 70 && k.getScore() <= 100;
        School school = new School();
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Vasya"));
    }

    @Test
    public void b() {
        List<Student> input = List.of(new Student("Alex", 10),
                new Student("Ivan", 60),
                new Student("Vasya", 90)
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 50 && k.getScore() < 70;
        School school = new School();
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Ivan"));
    }

    @Test
    public void c() {
        List<Student> input = List.of(new Student("Alex", 10),
                new Student("Ivan", 60),
                new Student("Vasya", 90)
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 0 && k.getScore() < 50;
        School school = new School();
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Alex"));
    }
}