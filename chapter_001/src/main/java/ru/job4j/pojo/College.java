package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Zelenko Aleksandr Vikentevich");
        student.setGroup(600841);
        student.setReceiptDate(new Date());

        System.out.println(student.getFio() + System.lineSeparator() + student.getGroup() +
                System.lineSeparator() + student.getReceiptDate());
    }
}
