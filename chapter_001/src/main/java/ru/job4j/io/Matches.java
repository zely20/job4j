package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  matches = 11;
        boolean player = false;
        int select;
        System.out.println("Спички можно взять от 1 до 3, кто взял последнии тот победил");
        while (matches > 0) {
            if (!player) {
                System.out.println("Спички берет первый игрок");
                select = Integer.valueOf(input.nextLine());
                player = true;
            } else {
                System.out.println("Спички берет второй игрок");
                select = Integer.valueOf(input.nextLine());
                player = false;
            }
            if (select >= 1 && select <= 3) {
                matches -= select;
                System.out.println("На столе осталось " + matches + " спичек");
            } else {
                System.out.println("введите правильное число спичек");
            }
        }
        if (player) {
            System.out.println("Win first player");
        } else {
            System.out.println("Win second player");
        }
    }
}
