package case_study.models;

public class Customer extends Person {
    private String customerCode;
    private String emailAddress;
    private String customerType; //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String sex, int identityCardNumber, int phoneNumber, String customerCode, String emailAddress, String customerType, String address) {
        super(name, dateOfBirth, sex, identityCardNumber, phoneNumber);
        this.customerCode = customerCode;
        this.emailAddress = emailAddress;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
