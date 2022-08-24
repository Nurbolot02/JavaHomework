package Lesson4;

public class Employee {

    public enum Position{
        Manager,
        Director,
        HeadOfDeportment,
        Consultant
    };
    private String name;
    private String sureName;
    private short age;
    private String phoneNumber;
    private String passport;
    Position position;

    static int count = 0;

    Employee(String name, String sureName, short age, String phoneNumber, String passport, Position position) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
        this.position = position;
        count++;
    }

    private String getName() {
        return name;
    }

    public String getName(Employee employee) {
        if (this.position == Position.Manager){
            return employee.getName();
        }
        return "You can't see this information";
    }

    private String getSureName() {
        return sureName;
    }

    public String getSureName(Employee employee) {
        if (this.position == Position.Manager){
            return employee.getSureName();
        }
        return "You can't see this information";
    }

    private short getAge() {
        return age;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Employee employee, String phoneNumber) {
        if (this.position == Position.Consultant) {
            employee.setPhoneNumber(phoneNumber);
            System.out.println("Phone number changed!");
        } else {
            System.out.println("You can't change this pole! Because you aren't consultant!");
        }

    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassport(Employee employee) {
        if (this.position == Position.Manager) {
            if (this.passport != null) {
                return "...";
            } else {
                return "null";
            }
        } else {
            return employee.getPassport();
        }
    }

    private String getPassport() {
        return this.passport;
    }

    public Position getPosition() {
        return position;
    }
}
