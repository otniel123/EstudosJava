package entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitularConta;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitularConta){
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        this.saldo = 0;
    }

    public ContaBancaria(int numeroConta, String nomeTitularConta, double initialDeposit){
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        depositar(initialDeposit);
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(double valor){
        valor = valor + 5;
        if (this.saldo - valor >0){
            this.saldo = saldo - valor;
        }else {
            System.out.println("Não há saldo suficiente para fazer o seu saque.");
        }
    }

    public void mostrarDados(){
        System.out.println("Número da conta: " + this.getNumeroConta() + "\nTitular da conta: " + this.getNomeTitularConta() + "\nSaldo atual da conta: " + this.getSaldo());
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public String getNomeTitularConta(){
        return this.nomeTitularConta;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return  this.saldo;
    }
}
