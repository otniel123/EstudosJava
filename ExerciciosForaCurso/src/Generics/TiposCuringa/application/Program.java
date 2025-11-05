package Generics.TiposCuringa.application;

import Generics.TiposCuringa.entities.Impressora;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(44);
        list.add(222);
        list.add(324);
        list.add(66);
        list.add(null);


        Impressora.imprimirLista(list);
        System.out.println(Impressora.contaNulos(list));
    }
}
