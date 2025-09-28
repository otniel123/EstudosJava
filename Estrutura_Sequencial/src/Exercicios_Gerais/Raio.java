package Exercicios_Gerais;

public class Raio {
    public static void main(String[] args) {
        double pi = 3.14159;
        double raio = 2;
        double area = pi * Math.pow(raio, 2);

        System.out.println(String.format("%.4f", area));
    }
}
