package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

  private final String id;
  private final String name;
  private final List<BankAccount> accounts;

  public BankCustomer(String id, String name) {
    this(id, name, null);
  }

  public BankCustomer(String id, String name, List<BankAccount> accounts) {
    this.id = id;
    this.name = name;
    this.accounts = new ArrayList<>();
    if (accounts == null) {
      return;
    }
    for (var account : accounts) {
      this.accounts.add(new BankAccount(account.getAccountType(), account.getBalance()));
    }
  }

  public boolean addAccount(String accountType, double balance) {
    return accounts.add(new BankAccount(accountType, balance));
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public final List<BankAccount> getAccounts() {
    List<BankAccount> accountsCopy = new ArrayList<>();
    for (var account : accounts) {
      accountsCopy.add(new BankAccount(account.getAccountType(), account.getBalance()));
    }
    return accountsCopy;
  }

  @Override
  public String toString() {
    return "BankCustomer{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", accounts=" + accounts +
      '}';
  }
}
