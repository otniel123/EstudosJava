package Heranca.application;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;

public class AccountApplication {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc5 = new Account(1001, "Alex", 1000.0);
        acc5.withdraw(200);
        System.out.println(acc5.getBalance());

        Account acc6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());



        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
