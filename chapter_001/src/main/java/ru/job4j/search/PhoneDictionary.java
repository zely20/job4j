package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate <Person> containName = k -> k.getName().equals(key);
        Predicate <Person> containSurname = k -> k.getSurname().equals(key);
        Predicate <Person> containAddress = k -> k.getAddress().equals(key);
        Predicate <Person> containPhone = k -> k.getPhone().equals(key);
        Predicate <Person> containPerson = k -> containName
                .or(containSurname)
                .or(containAddress)
                .or(containPhone).test(k);

/*        Predicate<Person> combine = (k) -> k.getName().equals(key) ||
                k.getSurname().equals(key) ||
                k.getAddress().equals(key) ||
                k.getPhone().equals(key);*/
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (containPerson.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
