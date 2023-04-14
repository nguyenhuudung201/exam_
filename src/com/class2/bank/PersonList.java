package com.class2.bank;

import java.util.Scanner;
public class PersonList extends Person {
    Wallet wallet;

    public PersonList(){
        this.wallet = new Wallet();
    }
    @Override
    public void addNewPerson() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter phone: ");
        this.phone = input.nextLine();

    }

    @Override
    public void deposit() {
        System.out.println("Enter money: ");
        Scanner input = new Scanner(System.in);
        money=input.nextInt();
        wallet.deposit(money);
        System.out.println("Your money: "+wallet.amount);
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Enter money: ");
        Scanner input = new Scanner(System.in);
        money=input.nextInt();
        wallet.withdraw(money);
        System.out.println("Your money: "+wallet.amount);
    }

    @Override
    public void updateAccount() {
        System.out.print("Enter name update: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email update: ");
        this.email = input.nextLine();

        System.out.print("Enter phone update: ");
        this.phone = input.nextLine();
    }

    @Override
    public void displayAll() {
        System.out.println("Your name: " + this.name);
        System.out.println("Your email: " + this.email);
        System.out.println("Your phone:  " + this.email);
        System.out.println("Your ID:  " + this.id);
        System.out.println("Your Money: "+wallet.amount);
    }
}
