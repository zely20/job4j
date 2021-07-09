package ru.job4j.bank;

import java.util.*;
import java.util.Map.Entry;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user= findByPassport(passport);
        if (user.isPresent()) {
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }


    public Optional<User> findByPassport(String passport) {
        Optional<User> user;
        return user = Optional.ofNullable(users
                .keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findAny()
                .orElse(null));
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> account;
        return account = Optional.of(users.entrySet()
                .stream()
                .filter(f -> f.getKey().getPassport().equals(passport))
                .map(Entry::getValue)
                .flatMap(l -> l.stream())
                .filter(ac -> ac.getRequisite().equals(requisite))
                .findAny()
                .orElse(null));
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, dеstRequisite);
        if ((srcAccount.isPresent() && srcAccount.get().getBalance() >= amount) && destAccount.isPresent()) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            return true;
        }
        return rsl;
    }
}
