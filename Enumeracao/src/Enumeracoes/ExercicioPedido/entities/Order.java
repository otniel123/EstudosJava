package Enumeracoes.ExercicioPedido.entities;

import Enumeracoes.ExercicioPedido.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private LocalDateTime moment;
    private Client client;

    public Order(){

    }

    public Order(OrderStatus status, List<OrderItem> orderItems, LocalDateTime moment) {
        this.status = status;
        this.orderItems = orderItems;
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        double sum = 0;
        for (OrderItem item : orderItems){
            sum += item.subTotal();
        }
        return sum;
    }
}
