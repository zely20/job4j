package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book idiot = new Book("Идиот", 100);
        Book cleanCode = new Book("Clean code", 350);
        Book voinaMir = new Book("Воина и Мир", 850);
        Book masterMargarita = new Book("Мастер и Маргарита", 250);

        books[0] = idiot;
        books[1] = cleanCode;
        books[2] = voinaMir;
        books[3] = masterMargarita;

        for (Book i: books) {
            System.out.println(i.getName());
        }
        System.out.println("__________________");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book i: books) {
            System.out.println(i.getName());
        }
        System.out.println("__________________");
        for (Book i: books) {
            if (i.getName().equals("Clean code")) {
                System.out.println(i.getName());
            }
        }

    }
}
