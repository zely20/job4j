package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStudentToMap {

    public Map<String, Student> convert(List<Student> students) {
         Map<String, Student> mapStudent = students.stream()
                .distinct()
                .collect(Collectors.toMap(s -> s.getSurname(), s -> s));
         return mapStudent;
    }
}
