package application;

import entities.Employee;

public class EmployeeUtilizacao {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Otniel Marques";
        employee.grossSalary = 32000;
        employee.tax = 10;
        employee.increaseSalary(100);
        employee.showInformations();

        employee.showInformations();
    }
}
