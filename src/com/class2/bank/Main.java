package com.class2.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AccountManagement accountManagement = new AccountManagement();
        int choose;

        do {
            System.out.println("1. Create a Account ");
            System.out.println("2. Display All ");
            System.out.println("3. Find person by id");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Update Account");
            System.out.println("7. Exit");

            System.out.println("Choose menu: ");


            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    accountManagement.addNewPerson();
                }
                break;
                case 2: {
                    accountManagement.displayAll();
                }
                break;
                case 3: {
                    Person accountManagement1 =  accountManagement.findPersonById();
                    if(  accountManagement1 != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 4: {
                    accountManagement.deposit();
                }
                break;
                case 5: {
                    accountManagement.withdrawMoney();
                }
                break;
                case 6: {
                    accountManagement.updatePersonById();
                }
                break;
                case 7: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }
}

