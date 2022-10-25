package case_study.models;

public class Employee extends Person {
    private int employeeCode;
    private String emailAddress;
    private String level;
    private String position;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String sex, int identityCardNumber, int phoneNumber, int employeeCode, String emailAddress, String level, String position, double basicSalary) {
        super(name, dateOfBirth, sex, identityCardNumber, phoneNumber);
        this.employeeCode = employeeCode;
        this.emailAddress = emailAddress;
        this.level = level;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee is a subclass of " +
                super.toString() +
                "employeeCode=" + employeeCode +
                ", emailAddress='" + emailAddress + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

}
