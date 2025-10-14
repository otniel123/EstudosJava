package ExercicioResolvido.application;

import ExercicioResolvido.entities.Employee;
import ExercicioResolvido.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioResolvidoApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();;
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.println("Additional charge: ");
                double addtionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addtionalCharge);
                list.add(emp);
            }else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Payments");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + emp.payment());
        }
    }
}
