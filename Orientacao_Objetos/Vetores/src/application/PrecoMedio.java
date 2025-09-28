package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class PrecoMedio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i].getPrice();
        }

        System.out.println("Average Price: " + (sum / n));

        sc.close();
    }
}
