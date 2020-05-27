package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {

    public static List<Student> levelOf(List<Student> students, int bound) {
        List<Student> result;
        return result = students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .dropWhile(s -> s.getScore() < bound)
                .collect(Collectors.toList());
    }
}
