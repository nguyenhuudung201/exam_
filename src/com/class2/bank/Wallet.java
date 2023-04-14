package com.class2.bank;

public class Wallet {
    int amount;

    Wallet(){
        this.amount = 0;
    }

    public void deposit(int money) {
        this.amount += money;
    }
    public void withdraw(int money) {
        this.amount -= money;
    }
}

