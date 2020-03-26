package ru.job4j.ex;

public class FindEL {

    public static void main(String[] args) {
        String[] value = {"Vasya", "Sasha", "Petya"};
        try {
            System.out.println(indexOf(value,"Sash"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length ; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        if (rsl == -1){
            throw new ElementNotFoundException("Not found");
        }
        return rsl;
    }
}
