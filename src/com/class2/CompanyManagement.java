package com.class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    List<Staff> list;
    int currentId = 0;
    int sum;
    public CompanyManagement() {
        list = new ArrayList<Staff>();
    }

    public void addNewPerson() {
        System.out.println("1. Create a Employee ");
        System.out.println("2. Create a Manager ");
        System.out.println("3. Create a Director  ");
        System.out.print("Please choose: ");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        Staff newStaff = null;

        switch (choose) {
            case 1: {
                newStaff = new Employee();
            }
            break;
            case 2: {
                newStaff = new Manager();
            }
            break;
            case 3: {
                newStaff = new Director();
            }
            break;
        }
        newStaff.setId(++currentId);
        newStaff.addNewPerson();
        newStaff.getBonus();
        list.add(newStaff);
    }

    public void displayAll() {
        for (Staff item : list) {
            item.displayAll();
        }
    }

    Staff findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();
        for (Staff item : list) {
            if (findId == item.getId()) {
                item.displayAll();

                return item;
            }
        }
        return null;
    }

    public void updatePersonById() {
        Staff findShape = this.findPersonById();
        if (findShape != null) {
            findShape.updatePerson();
        } else {
            System.out.println("Not found");
        }
    }

    public int getTotalBonusOfCompany() {
        int total = 0;
        for (Staff item : list) {
            total += item.getBonus();
        }
        return this.sum=total;
    }
    public void updateSalaryById(){
        Staff findShape = this.findPersonById();
        if (findShape != null) {
            findShape.updateSalary();
        } else {
            System.out.println("Not found");
        }
    }
}