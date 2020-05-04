package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zel@mail.ru", "Zel alex");
        map.put("zel1@mail.ru", "Zel1 alex");
        map.put("zel12@mail.ru", "Zel12 alex");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
