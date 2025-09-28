package Exercicios_Gerais;

public class Funcionario {
    public static void main(String[] args) {
        int numeroFuncionario = 25;
        int horasTrabalhadas = 100;
        double salario = 5.50;

        System.out.println("Número Funcionário: " + numeroFuncionario);
        System.out.println(String.format("Salario: %.2f" ,(salario * horasTrabalhadas)));
    }
}
