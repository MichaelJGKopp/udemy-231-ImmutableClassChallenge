package dev.lpa;

public final class BankAccount {

  private final AccountType accountType;
  private double balance;

  private enum AccountType {
    CHECKING, SAVINGS
  }

  public BankAccount() {
    this("CHECKING");
  }

  public BankAccount(String accountType) {
    this(accountType, 0.0);
  }

  public BankAccount(String accountType, double balance) {
    accountType = accountType.toUpperCase().trim();
    AccountType accountType1;
    try {
      accountType1 = AccountType.valueOf(accountType);
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException("Invalid account type: " + accountType);
    }
    this.accountType = accountType1;
    this.balance = balance;
  }

  public String getAccountType() {
    return accountType.toString();
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  @Override
  public String toString() {
    return "BankAccount{" +
      "accountType=" + accountType +
      ", balance=" + balance +
      '}';
  }
}
