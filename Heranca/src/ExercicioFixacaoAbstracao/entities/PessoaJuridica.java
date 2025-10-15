package ExercicioFixacaoAbstracao.entities;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridica extends Pessoa{

    private List<Funcionario> list = new ArrayList<>();
    private int numberOfEmployees;

    public PessoaJuridica(){

    }

    public List<Funcionario> getList() {
        return list;
    }

    public void setList(List<Funcionario> list) {
        this.list = list;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public PessoaJuridica(String name, Double annualRent, int numberOfEmployees) {
        super(name, annualRent);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double impostValue() {
        if (numberOfEmployees > 10){
            return this.getAnnualRent() * 0.14;
        }
        return this.getAnnualRent() * 0.16;
    }
}
