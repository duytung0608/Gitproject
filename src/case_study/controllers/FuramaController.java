package case_study.controllers;

import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managenment");
            System.out.println("5. Promotion Managenment");
            System.out.println("6. Exit");
            System.out.println("Please select function: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employees");
                    System.out.println("4. Return main menu");
                    System.out.println("Please select function: ");
                    int choice1 = -1;
                    choice1 = input.nextInt();
                    switch (choice1) {
                        case 1: {
                            employeeService.displayEmployee();
                            break;
                        }
                        case 2: {
                            employeeService.addNewEmployee();
                            break;
                        }
                        case 3: {
                            employeeService.editEmployee();
                            break;
                        }
                        default: {
                            FuramaController.displayMainMenu();
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    System.out.println("Please select function: ");
                    int choice2 = -1;
                    choice2 = input.nextInt();
                    switch (choice2) {
                        case 1: {
                            customerService.displayCustomer();
                            break;
                        }
                        case 2: {
                            customerService.addNewCustomer();
                            break;
                        }
                        case 3: {
                            customerService.editCustomer();
                            break;
                        }
                        default:
                            FuramaController.displayMainMenu();
                    }
                    break;

                }
                case 3: {
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    System.out.println("Please select function: ");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1: {

                            break;
                        }
                        case 2: {
                            System.out.println("1. Add new Villa");
                            System.out.println("2. Add new House");
                            System.out.println("3. Add new Room");
                            System.out.println("4. Back to mennu");
                            int temp = input.nextInt();
                            switch (temp) {
                                case 1: {


                                    break;
                                }
                                case 2: {

                                    break;
                                }
                            }
                            break;
                        }
                        case 3: {

                            break;
                        }
                        default: {
                            FuramaController.displayMainMenu();
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("1. Add new Booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    break;
                }
                case 5: {
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
            }
        } while (choice!=6);
    }

    public static void main(String[] args) {
        FuramaController.displayMainMenu();
    }
}
