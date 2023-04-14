package com.class2;

public abstract class Staff {
    String email;
    String name;
    int id;
    int salary;
    public abstract void addNewPerson ();
    public abstract void displayAll();
    public void setId(int id) {
        this.id = id;
    }
    public abstract void updatePerson();
    public int getId() {
        return this.id;
    }

    public  void setSalary(int salary){
        this.salary=salary;
    }
    public abstract void updateSalary();
    public abstract int getBonus();

}
