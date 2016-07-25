package xp.demo.codesmell.largeclass;


public class Employee {

    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private String officeExtensionNumber;
    private String homeAddress;
    private String homeCity;
    private String homePinCode;

    public Employee(String name, String officeAreaCode, String officeNumber, String officeExtensionNumber, String homeAddress, String homeCity, String homePinCode) {
        this.name = name;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
        this.officeExtensionNumber = officeExtensionNumber;
        this.homeAddress = homeAddress;
        this.homeCity = homeCity;
        this.homePinCode = homePinCode;
    }

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ") " + officeNumber + "-" + officeExtensionNumber;
    }

    public String getAddress() {
        return homeAddress + "\n" + homeCity + "(" + homePinCode + ") ";
    }

    public String getName() {
        return name;
    }
}