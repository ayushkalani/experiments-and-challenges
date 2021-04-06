package com.ayush;

public class Bank {

    private long accountId;
    private long balance;
    private String mobileNumber;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void depositFunds(int add) {
        this.balance += (long) add;
    }

    public void withdrawFunds(int sub) {
        if ((long)sub <= this.balance)  this.balance -= (long) sub;
    }

    public Bank(long accountId, long balance, String mobileNumber) {
        this.accountId = accountId;
        this.balance = balance;
        this.mobileNumber = mobileNumber;
    }
}
