package Enumeracoes.application;

import Enumeracoes.entities.Order;
import Enumeracoes.entities.enums.OrderStatus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
