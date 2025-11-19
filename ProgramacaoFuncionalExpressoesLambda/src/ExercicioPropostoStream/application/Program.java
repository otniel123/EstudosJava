package ExercicioPropostoStream.application;

import ExercicioPropostoStream.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.println("Enter salary: ");
        Double salary = sc.nextDouble();

        List<Employee> emp = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null){
                String fields[] = line.split(",");
                emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> email =
                    emp.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted(comp).collect(Collectors.toList());
            double sum =
                    emp.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);

            System.out.println("Email of people whose salary is more than " + salary + ": ");
            for (String s : email){
                System.out.println(s);
            }
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
