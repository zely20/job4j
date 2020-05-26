package ru.job4j.bank;

import java.util.*;
import java.util.Map.Entry;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }


    public User findByPassport(String passport) {
        User user;
        return user = users
                .keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account;
        return account = users.entrySet()
                .stream()
                .filter(f -> f.getKey().getPassport().equals(passport))
                .map(Entry::getValue)
                .flatMap(l -> l.stream())
                .filter(ac -> ac.getRequisite().equals(requisite))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dеstRequisite);
        if ((srcAccount != null && srcAccount.getBalance() >= amount) && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return rsl;
    }
}
