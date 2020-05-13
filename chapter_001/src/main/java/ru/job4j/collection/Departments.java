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
        sortAsc(rsl);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(new DepAscComp());
    }

    public static void sortDesc(List<String> orgs) {
            orgs.sort(new DepDescComp());
    }
}
