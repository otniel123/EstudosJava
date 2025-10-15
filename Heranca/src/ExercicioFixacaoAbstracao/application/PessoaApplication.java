package ExercicioFixacaoAbstracao.application;

import ExercicioFixacaoAbstracao.entities.Pessoa;
import ExercicioFixacaoAbstracao.entities.PessoaFisica;
import ExercicioFixacaoAbstracao.entities.PessoaJuridica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();
            if (ic == 'i'){
                System.out.println("Health expenditures: ");
                Double he = sc.nextDouble();;
                list.add(new PessoaFisica(name, annualIncome, he));
            }else if (ic == 'c'){
                System.out.println("Number of Employees: ");
                int employeeNumber = sc.nextInt();;
                list.add(new PessoaJuridica(name, annualIncome, employeeNumber));
            }
        }

        System.out.println("Taxes Paid:");
        for (Pessoa p : list){
            System.out.println(p.getName() + ": $ " + p.impostValue());
        }

        double sum = 0;
        for (Pessoa p : list){
            sum+=p.impostValue();
        }

        System.out.println("Total Taxes: $ " + sum);
    }
}
