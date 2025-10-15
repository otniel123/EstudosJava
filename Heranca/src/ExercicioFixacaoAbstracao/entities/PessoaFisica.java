package ExercicioFixacaoAbstracao.entities;

public class PessoaFisica extends Pessoa{

    private Double healthCosts;

    public PessoaFisica(){

    }

    public PessoaFisica(String name, Double annualRent, Double healthCosts) {
        super(name, annualRent);
        this.healthCosts = healthCosts;
    }

    public Double getHealthCosts() {
        return healthCosts;
    }

    public void setHealthCosts(Double healthCosts) {
        this.healthCosts = healthCosts;
    }

    @Override
    public double impostValue() {
        if(this.getAnnualRent() < 20000){
            if (this.healthCosts > 0){
                return (this.getAnnualRent() * 0.15) - (this.healthCosts * 0.5);
            }
            return (this.getAnnualRent() * 0.15);
        }
        if(this.getAnnualRent() >= 20000){
            if (this.healthCosts > 0){
                return (this.getAnnualRent() * 0.25) - (this.healthCosts * 0.5);
            }
            return (this.getAnnualRent() * 0.25);
        }
        return 0;
    }
}
