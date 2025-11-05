package Generics.GenericsDelimitados.Ordenador.application;

import Generics.GenericsDelimitados.Ordenador.entities.Ordenador;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Ordenador<Integer> ordenador = new Ordenador<>();
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(1);
        list.add(5);
        list.add(66);
        list.add(17);
        list.add(-3);

        ordenador.ordenarCrescente(list);
        ordenador.ordernarDecrescente(list);
        System.out.println(ordenador.encontrarMaior(list));
        System.out.println(ordenador.encontrarSegundoMaior(list));
    }
}
