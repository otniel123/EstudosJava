package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioFuncionarioApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        List <Funcionario> listaFuncionario = new ArrayList<>();
        for (int i = 0; i<n; i++){
            System.out.println("Employee #" + (i +1));

            System.out.println("ID: ");
            int id = sc.nextInt();

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, salary, name);

            listaFuncionario.add(i, funcionario);
        }

        System.out.println("Digite o id do funcionário que terá o salário aumentado: ");
        int id = sc.nextInt();

        for(Funcionario funcionario : listaFuncionario){
            if (funcionario.getId() == id){
                System.out.println("Digite a porcentagem de aumento de salário: ");
                double pct = sc.nextDouble();
                funcionario.aumentarSalarioPorcentagem(pct);
            }
        }

        for (Funcionario funcionario : listaFuncionario){
            System.out.println(funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getSalario());
        }
    }
}
