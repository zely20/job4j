package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("bmw");
        autos.add("toyta");
        autos.add("volvo");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
