package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ConvertStudentToMap {

    public static Map<String, Student> convert(List<Student> students) {
         Map<String, Student> mapStudent = students.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student, (a, b) -> a));
         return mapStudent;
    }
}
