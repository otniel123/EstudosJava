package entities;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int id, double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumentarSalarioPorcentagem(double pct){
        this.salario = salario + (salario * (pct / 100));
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
