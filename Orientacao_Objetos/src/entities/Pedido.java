package entities;

import javax.xml.namespace.QName;

public class Pedido {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque(){
        return preco * quantidade;
    }

    public void adicionarItensEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerItensEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void mostrarDadosItens(){
        System.out.println("Nome: " + this.nome + "\nPreco: " + this.preco + "\nQuantidade: " + this.quantidade + "\nValor total em estoque: " + valorTotalEstoque());
    }

    public String toString(){
        return nome +", $" + ", " +  preco + ", " + "Units " + quantidade + ", valor total em " +
                "estoque" +  valorTotalEstoque();
    }
}
