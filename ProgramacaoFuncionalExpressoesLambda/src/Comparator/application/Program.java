package Comparator.application;

import Comparator.entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


// Forma1======================CHAMANDO A CLASSE QUE DECLARAMOS======================
//        list.sort(new MyComparator());


// Forma2========================== DECLARANDO CLASSE ANONIMA NO PRÓPRIO PROGRAMA =================
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//
//        list.sort(comp);




// Forma3========================= UTILIZANDO EXPRESSÃO LAMBDA ============================
            Comparator<Product> comp = (p1, p2) -> {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            };

            list.sort(comp);




        for (Product p : list){
            System.out.println(p);
        }
    }
}
