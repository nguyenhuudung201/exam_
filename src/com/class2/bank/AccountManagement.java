package com.class2.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AccountManagement {
    List<Person> list;
    int currentId = 0;
    int sum;
    public AccountManagement() {
        list = new ArrayList<Person>();
    }
    public void addNewPerson() {
        Person newPerson = null;
        newPerson= new PersonList();
        newPerson.addNewPerson();
        newPerson.setId(++currentId);
        System.out.println("Your ID: "+newPerson.getId());
        list.add(newPerson );
    }
    public void displayAll() {
        for (Person item : list) {
            item.displayAll();
        }
    }
    Person findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();
        for (Person item : list) {
            if (findId == item.getId()) {
                item.displayAll();
                return item;
            }
        }
        return null;
    }
    public void deposit() {
        Person findShape = this.findPersonById();
        if (findShape != null) {
            findShape.deposit();
        } else {
            System.out.println("Not found");
        }
    }
    public void withdrawMoney() {
        Person findPerson  = this.findPersonById();
        if (findPerson != null) {
            findPerson.withdrawMoney();
        } else {
            System.out.println("Not found");
        }
    }
    public void updatePersonById() {
        Person findPerson = this.findPersonById();
        if (findPerson != null) {
            findPerson.updateAccount();
        } else {
            System.out.println("Not found");
        }
    }
}

