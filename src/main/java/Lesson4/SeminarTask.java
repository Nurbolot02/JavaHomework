package Lesson4;

public class SeminarTask {
    public static void main(String[] args) {
        Employee maneger = new Employee("Nurbolot", "Gulamidinov", (short) 20, "996755051102", "ID1406633", Employee.Position.Manager);
        Employee headOfDepartment = new Employee("oleg", "Olegovich", (short) 40, "78954562152", "ID1406653", Employee.Position.HeadOfDeportment);
        Employee consultant = new Employee("Ivan", "Ivanov", (short) 30, "78954562155", "ID1408653", Employee.Position.Consultant);
        Employee director = new Employee("Vasya", "Vladimirovich", (short) 45, "78554562155", "ID1408253", Employee.Position.Director);
        System.out.println(Employee.count);

        maneger.setPhoneNumber(headOfDepartment, "78942586315");
        headOfDepartment.setPhoneNumber(headOfDepartment, "78942586315");
        director.setPhoneNumber(headOfDepartment, "78942586315");
        consultant.setPhoneNumber(headOfDepartment, "78942586315");

        System.out.println(maneger.getName(headOfDepartment));
        System.out.println(consultant.getName(headOfDepartment));
    }
}
