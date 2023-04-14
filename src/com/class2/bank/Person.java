package com.class2.bank;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Person {
    Wallet wallet;
    String name;
    String email;
    String phone;
    int money;
    int id=0 ;
    public abstract void addNewPerson ();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void displayAll();
    public abstract void deposit();
    public abstract void withdrawMoney();
    public abstract void updateAccount();
}

