package entrada_de_dados_Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		sc.close();*/





		/*Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);

		sc.close();*/





		/*Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);

		sc.close();*/





        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
