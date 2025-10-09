package Enumeracoes.ExercicioPedido.application;

import Enumeracoes.ExercicioPedido.entities.Client;
import Enumeracoes.ExercicioPedido.entities.Order;
import Enumeracoes.ExercicioPedido.entities.OrderItem;
import Enumeracoes.ExercicioPedido.entities.Product;
import Enumeracoes.ExercicioPedido.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class OrderApplication {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Order order = new Order();
        order.setMoment(LocalDateTime.now());

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));

        order.setClient(client);

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        String orderStatus = sc.nextLine();
        order.setStatus(OrderStatus.valueOf(orderStatus));

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            Double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(product, quantity);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName() + "(" + order.getClient().getBirhDate() + ")" + " - " + order.getClient().getEmail());
        System.out.println("Order items: ");
        for (OrderItem item : order.getOrderItems()){
            String productName = item.getProduct().getName();
            Double productPrice = item.getProduct().getPrice();
            Integer productQuantity = item.getQuantity();
            System.out.println(productName + ", $" + productPrice + ", Quantity: " + productQuantity + ", Subtotal: $" + item.subTotal());

        }
        System.out.println("Total price: $" + order.total());

    }
}
