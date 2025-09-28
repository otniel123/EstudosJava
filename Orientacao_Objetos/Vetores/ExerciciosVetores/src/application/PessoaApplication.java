package application;

import entities.Pessoa;

import java.util.Scanner;

public class PessoaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaAltura = 0;
        double qtdMenores = 0;
        double n = 5;
        Pessoa[] pessoas = new Pessoa[(int)n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            if(i > 0){
            sc.nextLine();
            }
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            if(pessoas[i].getIdade() < 16){
                qtdMenores  = qtdMenores +1;
            }
            somaAltura += pessoas[i].getAltura();
        }

        double porcentagemMenores = (qtdMenores / n) * 100;

        System.out.println("Altura Média = " + (somaAltura / n));
        System.out.println("Pessoas com menos de 16 anos = " + porcentagemMenores + "%");

        for(int i = 0; i<n; i++){
            if (pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }
        sc.close();


    }
}
