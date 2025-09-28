package application;

import java.util.Scanner;

public class numeroNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;

        int[] vector = new int[n];

        for (int i = 0; i<n; i++){
            System.out.println("Digite um número");
            int numero = sc.nextInt();
            vector[i] = numero;
        }

        System.out.println("Número negativos: ");
        for(int i = 0; i<vector.length; i++){
            if (vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

    }
}
