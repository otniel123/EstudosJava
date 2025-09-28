package application;

import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        double soma = 0;

        double[] vector = new double[n];

        for (int i =0; i < n; i++){
            double numero = sc.nextDouble();
            vector[i] = numero;
            soma += vector[i];
        }

        System.out.println("Valores: ");
        for (int i = 0; i<n; i++){
            System.out.println(vector[i]);
        }

        System.out.println("Soma = " + soma);
        System.out.println("Media = " + (soma / n));
    }
}
