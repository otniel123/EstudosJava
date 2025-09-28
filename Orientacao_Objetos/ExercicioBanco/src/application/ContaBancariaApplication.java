package application;

import entities.ContaBancaria;

public class ContaBancariaApplication {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "Otniel Marques");
        conta.mostrarDados();

        conta.depositar(1600);
        conta.mostrarDados();

        conta.sacar(1500);
        conta.mostrarDados();
    }
}
