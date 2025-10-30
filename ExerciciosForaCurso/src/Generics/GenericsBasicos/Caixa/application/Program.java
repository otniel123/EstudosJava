package Generics.GenericsBasicos.Caixa.application;

import Generics.GenericsBasicos.Caixa.entities.Caixa;

public class Program {
    public static void main(String[] args) {
        Caixa<Integer> caixa1 = new Caixa();

        System.out.println(caixa1.getListaItems());
        System.out.println(caixa1.estaVazia());
        caixa1.removeItem(2);
        caixa1.guardaItem(3);
        caixa1.guardaItem(4343);
        caixa1.guardaItem(45112);
        System.out.println(caixa1.getListaItems());

        Caixa<String> caixa2 = new Caixa();

        System.out.println(caixa2.getListaItems());
        System.out.println(caixa2.estaVazia());
        caixa2.guardaItem("Otniel");
        caixa2.guardaItem("Sara");
        caixa2.guardaItem("Alex");
        caixa2.guardaItem("Patricia");
        System.out.println(caixa2.getListaItems());
    }
}
