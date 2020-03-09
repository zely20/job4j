package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  matches = 11;
        System.out.println("Спички можно взять от 1 до 3, кто взял последнии тот победил");
        while (matches > 0) {
            System.out.println("Возмите спички");
            int select = Integer.valueOf(input.nextLine());
            if (select >= 1 && select <= 3) {
                matches -= select;
                System.out.println("На столе осталось " + matches + " спичек");
            } else {
                System.out.println("введите правильное число спичек");
            }
        }
        System.out.println("Game over");
    }
}