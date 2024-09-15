package dev.lpa;

import java.util.List;

public class BankCustomerSub extends BankCustomer {

  public BankCustomerSub(String id, String name) {
    super(id, name);
  }

  public BankCustomerSub(String id, String name, List<BankAccount> accounts) {
    super(id, name, accounts);
  }
}
