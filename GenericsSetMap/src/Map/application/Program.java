package Map.application;

import Map.entities.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        //========================TreeMap=======================
        //TreeMap mantém as chaves ordenadas (ordem alfabética/natural) e não permite chave null
        //Baseado em árvore Red-Black, mais lento que HashMap mas garante ordenação

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("Username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone","9971122");

        cookies.remove("email");
        cookies.put("phone","515151");

        System.out.println("Contais 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies");

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }




        //========================HashMap=======================
        //HashMap não garante ordem, permite uma chave null e múltiplos valores null
        //Mais rápido para operações básicas (get/put), usa tabela hash

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));




        //========================LinkedHashMap=======================
        //LinkedHashMap mantém a ordem de inserção dos elementos
        //Combina HashMap com lista duplamente ligada, um pouco mais lento que HashMap puro

        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Janeiro", 31);
        linkedMap.put("Fevereiro", 28);
        linkedMap.put("Março", 31);
        linkedMap.put("Abril", 30);
        linkedMap.put("Maio", 31);

        System.out.println("\nLinkedHashMap - Mantém ordem de inserção:");
        for (String mes : linkedMap.keySet()) {
            System.out.println(mes + " tem " + linkedMap.get(mes) + " dias");
        }
    }
}