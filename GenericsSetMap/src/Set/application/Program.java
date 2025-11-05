package Set.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        //HashSet não aceita repetição e não garante ordem de inserção

        Set<String> set = new HashSet<>();

        System.out.println("==========================HashSet============================");


        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==========================TreeSet============================");

        //TreeSet não aceita repetição e coloca em ordem crescente Alfabetica

        Set<String> set2 = new TreeSet<>();

        set2.add("TV");
        set2.add("Notebook");
        set2.add("Tablet");

        System.out.println(set2.contains("Notebook"));

        for (String p : set2) {
            System.out.println(p);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("========================LinkedHashSet=========================");

        //LinkedHashSet não aceita repetição e mantém a ordem de inserção dos elementos

        Set<String> set3 = new LinkedHashSet<>();

        set3.add("TV");
        set3.add("Notebook");
        set3.add("Tablet");
        set3.add("Celular");
        set3.removeIf(x -> x.length() >= 3); //remove elementos com mais de 3 caracteres
        for (String p : set3) {
            System.out.println(p);
        }
        set3.remove("Celular");

        System.out.println(set3.contains("Notebook"));

        for (String p : set3) {
            System.out.println(p);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("========================Conjuntos=========================");

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
