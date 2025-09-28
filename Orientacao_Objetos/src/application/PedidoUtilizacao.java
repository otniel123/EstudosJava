package application;

import entities.Pedido;

import java.util.Scanner;

public class PedidoUtilizacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pedido p1 = new Pedido();

        System.out.println("Digite o nome do produto: ");
        p1.nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        p1.preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto em estoque: ");
        p1.quantidade = sc.nextInt();

        System.out.println(p1);

//        p1.mostrarDadosItens();
//
//        p1.adicionarItensEstoque(4);
//
//        p1.mostrarDadosItens();
//
//        p1.removerItensEstoque(2);
//
//        p1.mostrarDadosItens();

    }
}
