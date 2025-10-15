package ExercicioFixacaoAbstracao.entities;

public abstract class Pessoa {
    private String name;
    private Double annualRent;

    public Pessoa(){

    }

    public Pessoa(String name, Double annualRent) {
        this.name = name;
        this.annualRent = annualRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualRent() {
        return annualRent;
    }

    public void setAnnualRent(Double annualRent) {
        this.annualRent = annualRent;
    }

    public abstract double impostValue();
}
