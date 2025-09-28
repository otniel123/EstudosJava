package application;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas que a sua matriz deve ter: ");
        int m = sc.nextInt();

        System.out.println("Digite o número de colunas que a sua matriz deve ter: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número que você deseja ver as informações: ");
        int numero = sc.nextInt();

        for (int i =0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (matriz[i][j] == numero){
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (j < matriz[i].length - 1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (i < matriz.length - 1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
