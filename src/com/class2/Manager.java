package com.class2;

import java.util.Scanner;

public class Manager extends Staff{
    String department;
    public Manager(){

    }
    @Override
    public void addNewPerson() {
        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter department: ");
        this.department = input.nextLine();
        System.out.println("Enter salary: ");
        this.salary=input.nextInt();
        super.setSalary(salary);
    }

    @Override
    public void displayAll() {
        System.out.println("This is a Manager");
        System.out.println("Department " + this.department);
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);
        System.out.println("Salary " + this.salary);

    }

    @Override
    public void updatePerson() {
        System.out.print("Enter name update : ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print("Enter email update : ");
        this.email = input.nextLine();

        System.out.print("Enter department update  : ");
        this.department = input.nextLine();
    }

    @Override
    public void updateSalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary update: ");
        this.salary=input.nextInt();
        super.setSalary(salary);
        System.out.println("Salary update: "+salary);
    }

    @Override
    public int getBonus() {
        return 7 * this.salary;
    }
}
