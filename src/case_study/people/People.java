package case_study.people;

public abstract class People {
    private String name;
    private String dateOfBirth;
    private String sex;
    private int identityCardNumber;
    private int phoneNumber;

    public People() {
    }

    public People(String name, String dateOfBirth, String sex, int identityCardNumber, int phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // nhớ thêm phương thức abstract;;;
}
