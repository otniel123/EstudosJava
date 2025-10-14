package ExercicioFixacao.entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return this.name + " (used) $  "  + this.price + " (Manufatyre date: " + this.manufactureDate +
                ")";
    }
}
