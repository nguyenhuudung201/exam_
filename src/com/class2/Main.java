package com.class2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement = new CompanyManagement();

        do {
            System.out.println("1. Create a Staff ");
            System.out.println("2: Display All ");
            System.out.println("3. Find person by id");
            System.out.println("4. Update person");
            System.out.println("5. Display total bonus");
            System.out.println("6. Update Salary");
            System.out.println("7. Exit");

            System.out.println("Choose menu: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1: {
                    companyManagement.addNewPerson();
                }
                break;
                case 2: {
                    companyManagement.displayAll();
                }
                break;
                case 3: {
                    Staff companyManagement1 = companyManagement.findPersonById();
                    if( companyManagement1 != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 4: {
                    companyManagement.updatePersonById();

                }
                break;
                case 5: {
                    companyManagement.getTotalBonusOfCompany();
                    System.out.println("TotalBonusOfCompany: "+companyManagement.sum);
                }
                break;
                case 6: {
                    companyManagement.updateSalaryById();

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
