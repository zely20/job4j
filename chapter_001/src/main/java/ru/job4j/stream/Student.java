package ru.job4j.stream;

import java.util.Objects;

public class Student {

    private int score;

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    private String surname;

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
