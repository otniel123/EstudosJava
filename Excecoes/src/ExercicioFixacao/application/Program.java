package ExercicioFixacao.application;

import ExercicioFixacao.model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (Exception e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
