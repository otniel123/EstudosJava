package application;

import entities.Estudante;

import java.util.Scanner;

public class ExercicioPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroQuartos = 0;
        String nomeEstudante;
        String emailEstudante;
        int numeroIndiceQuarto = 0;
        System.out.println("Quantos quartos vão ser alugados?");
        numeroQuartos = sc.nextInt();

        Estudante[] quartosEstudante = new Estudante[10];


        for (int i = 0; i< numeroQuartos; i++){
            System.out.println("Rent #" + (i +1));
            System.out.println("Name: ");
            sc.next();
            nomeEstudante = sc.next();
            System.out.println("Email: ");
            emailEstudante = sc.next();
            Estudante estudante = new Estudante(nomeEstudante, emailEstudante);
            System.out.println("Room: ");
            numeroIndiceQuarto = sc.nextInt();
            quartosEstudante[numeroIndiceQuarto] = estudante;
            quartosEstudante[numeroIndiceQuarto] = estudante;
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i< quartosEstudante.length; i++){
            if (quartosEstudante[i] != null){
                System.out.println((i + ": " + quartosEstudante[i].getName() + ", " + quartosEstudante[i].getEmail()));
            }
        }
    }
}
