package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }
    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load += another.load;
    }

    public static void main(String[] args) {
        Battery one = new Battery(50);
        Battery two = new Battery(20);

        System.out.println(one.load);
        System.out.println(two.load);
        one.exchange(two);
        System.out.println(one.load);
        System.out.println(two.load);

    }
}
