package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<String>();
        Set<String> temp = new HashSet<>();
        for (String str : deps) {
            String start = "";
            for (String val : str.split("/")) {
                temp.add(start + val);
                start = start + val + "/";
            }
        }
        rsl.addAll(temp);
        rsl.sort(new DepDescComp());
        return rsl;
    }


    public static void main(String[] args) {
        List<String> dep = Arrays.asList("K1/SK1", "K1/SK1/SSK1");
        System.out.println(fillGaps(dep));
    }
}
