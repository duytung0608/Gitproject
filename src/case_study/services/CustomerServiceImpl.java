package case_study.services;

import case_study.models.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl {
    private LinkedList<Customer> customerList;

    public CustomerServiceImpl() {
        customerList = new LinkedList<>();
    }

    Scanner input = new Scanner(System.in);

    public boolean addNewCustomer() {
        System.out.println("Enter name: "); // xoas enter
        String name = input.nextLine();
        System.out.println("Enter date of birth:");
        String dateofbirth = input.nextLine();
        System.out.println("Enter gender:");
        String gender = input.nextLine();
        System.out.println("Enter identityCardNumber:");
        int identityCardNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter phoneNumber:");
        int phoneNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter customerCode:");
        String customerCode = input.nextLine();
        System.out.println("Enter emailAddress:");
        String emailAddress = input.nextLine();
        System.out.println("Enter customerType:");
        String customerType = input.nextLine();
        System.out.println("Enter address:");
        String address = input.nextLine();
        Customer customer = new Customer(name, dateofbirth, gender, identityCardNumber, phoneNumber, customerCode, emailAddress, customerType, address);
        return customerList.add(customer);
    }

    public void displayCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public Customer editCustomer() {
        System.out.println("enter the location you want to edit: ");
        int index = input.nextInt();
        Customer temp = customerList.remove(index);

        System.out.println("Enter name: "); // xoas enter
        String name = input.nextLine();
        System.out.println("Enter date of birth:");
        String dateofbirth = input.nextLine();
        System.out.println("Enter sex:");
        String sex = input.nextLine();
        System.out.println("Enter identityCardNumber:");
        int identityCardNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter phoneNumber:");
        int phoneNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter customerCode:");
        String customerCode = input.nextLine();
        System.out.println("Enter emailAddress:");
        String emailAddress = input.nextLine();
        System.out.println("Enter customerType:");
        String customerType = input.nextLine();
        System.out.println("Enter address:");
        String address = input.nextLine();

        Customer customer1 = new Customer(name, dateofbirth, sex, identityCardNumber, phoneNumber, customerCode, emailAddress, customerType, address);
        customerList.add(index, customer1);
        return temp;
    }
}
