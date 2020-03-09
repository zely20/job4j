package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Введите вопрос с ответом да или нет ");
        String question  = input.nextLine();
        int  rd = new Random().nextInt(3);

        if (rd == 0) {
            System.out.printf("Ответ ДА");
        } else if (rd == 1){
            System.out.printf("Ответ НЕТ");
        } else {
            System.out.println("Может быть!");
        }
    }
}
