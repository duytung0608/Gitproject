package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class EmployeeServiceImpl {
    private ArrayList<Employee> employeeList;

    Scanner input = new Scanner(System.in);

    public EmployeeServiceImpl() {
        employeeList = new ArrayList<>();
    }

    public boolean addNewEmployee() {
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
        System.out.println("Enter employeeCode:");
        int employeeCode = Integer.parseInt(input.nextLine());
        System.out.println("Enter emailAddress:");
        String emailAddress = input.nextLine();
        System.out.println("Enter level:");
        String level = input.nextLine();
        System.out.println("Enter position:");
        String position = input.nextLine();
        System.out.println("Enter basicSalary:");
        double basicSalary = input.nextDouble();
        Employee employee = new Employee(name, dateofbirth, sex, identityCardNumber, phoneNumber, employeeCode, emailAddress, level, position, basicSalary);
        return employeeList.add(employee);
    }

    public void displayEmployee() {
        int i=1;
        while (!employeeList.isEmpty()) {
            System.out.println(i + ". " + employeeList.remove(0));
            i++;
        }
    }

    public Employee editEmployee() {
        System.out.println("enter the location you want to edit: ");
        int index = input.nextInt();
        Employee employee1 = employeeList.remove(index);

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
        System.out.println("Enter employeeCode:");
        int employeeCode = Integer.parseInt(input.nextLine());
        System.out.println("Enter emailAddress:");
        String emailAddress = input.nextLine();
        System.out.println("Enter level:");
        String level = input.nextLine();
        System.out.println("Enter position:");
        String position = input.nextLine();
        System.out.println("Enter basicSalary:");
        double basicSalary = input.nextDouble();
        Employee employee2 = new Employee(name, dateofbirth, sex, identityCardNumber, phoneNumber, employeeCode, emailAddress, level, position, basicSalary);
        employeeList.add(index, employee1);
        return employee1;
    }
}
