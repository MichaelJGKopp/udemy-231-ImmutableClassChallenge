package dev.lpa;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    BankCustomer john = new BankCustomer("123", "John");
    john.addAccount("Savings", 1000);
    john.addAccount("Checking", 2000);
    System.out.println(john);

    List<BankAccount> johnsAccounts = john.getAccounts();
    BankAccount johnsAccount1 = johnsAccounts.get(0);
    BankAccount johnsAccount2 = johnsAccounts.get(1);
    johnsAccount1.deposit(100);
    johnsAccounts = null;
    System.out.println(john);

    BankCustomer joe = new BankCustomer("321", "Joe");
    joe.addAccount("Savings", 1234);
    joe.addAccount("Checking", 2510);
    System.out.println(joe);

  }
}
