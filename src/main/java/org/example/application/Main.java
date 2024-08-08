package org.example.application;

import org.example.entities.Client;
import org.example.entities.Order;
import org.example.entities.OrderItem;
import org.example.entities.Product;
import org.example.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name,email,birthDate);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println();
        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(date,status,client);

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            Double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product p = new Product(nameProduct,priceProduct);
            OrderItem orderItem = new OrderItem(quantity,priceProduct,p);

            order.addItem(orderItem);
        }

        System.out.println(order);


    }
}