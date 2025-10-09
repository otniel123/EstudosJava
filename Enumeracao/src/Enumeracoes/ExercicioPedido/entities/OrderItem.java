package Enumeracoes.ExercicioPedido.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Product product = new Product();
    private Integer quantity;
    private Double price = product.getPrice();

    public OrderItem(){

    }

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public OrderItem(Product product, Integer quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return this.quantity * product.getPrice();
    }
}
