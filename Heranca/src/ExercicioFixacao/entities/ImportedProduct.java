package ExercicioFixacao.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return this.price + this.customsFee;
    }

    @Override
    public String priceTag(){
        return this.name + " $ " + totalPrice() + " (Customs fee: $ " + this.customsFee + ")";
    }
}
