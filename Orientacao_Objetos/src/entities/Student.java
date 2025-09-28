package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNota(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public double calcularMedia(){
        return  this.calcularNota() / 3;
    }

    public String calcularTag(){
        if (calcularNota() < 60){
            return "Failed";
        }else {
            return "Passed";
        }
    }

    public void showInformations(){
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);

        System.out.println("Notas totais: " + this.calcularNota());
        System.out.println("Média: " + this.calcularMedia());
        System.out.println("Resultado: " + this.calcularTag());
    }
}
