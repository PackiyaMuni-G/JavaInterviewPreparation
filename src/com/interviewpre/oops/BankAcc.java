package com.interviewpre.oops;

abstract  public class BankAcc {
 public String BankNo;
 public double  Balance;
 abstract void withdraw();

    public BankAcc(String bankNo, double balance) {
        BankNo = bankNo;
        Balance = balance;
    }
}
