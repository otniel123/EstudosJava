package ExercicioFixacaoAbstracao.entities;

public class Funcionario extends Pessoa{

    public Funcionario(){

    }

    public Funcionario(String name, Double annualRent) {
        super(name, annualRent);
    }

    @Override
    public double impostValue() {
        return 0;
    }
}
