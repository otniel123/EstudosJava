package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        double percent = tax * 0.01;
        return this.grossSalary - (this.grossSalary* percent);
    }

    public void increaseSalary(double percentage){
        percentage = percentage * 0.01;
        this.grossSalary = this.grossSalary +(this.grossSalary * percentage);
    }

    public void showInformations(){
        System.out.println("Nome funcionário: " + this.name);
        System.out.println("Salário liquido: " + this.netSalary());
        System.out.println("Taxa aplicada sobre o salário: " + this.tax);
    }
}
