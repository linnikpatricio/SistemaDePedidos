package org.example.entities;

public class Product {

    private String name;
    private Double price;

    public Product(){
    }
    public Product(String name,Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}


