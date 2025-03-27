package de.home.playgrounds.javabasics.exercise4_dataApp;

import java.util.UUID;

public class Product {

    private String id;
    private String productName;
    private double price;
    private boolean isInStock = true;
    private int amountInStock = 2;

    public Product (String productName, double price) {
        this.id = UUID.randomUUID().toString();
        this.productName = productName;
        this.price = price;

    }


    public void restockProduct(Product productName, int amountInStock) {
        amountInStock += 5;
        isInStock = true;
        System.out.println(productName + " has been restocked. Quantity: " + amountInStock);
    }

    public String getId() {
        return this.id;
    }

    // getter and setter
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return this.isInStock;
    }

    public void setInStock(boolean inStock) {
        this.isInStock = inStock;
    }

    public int getAmountInStock() {
        return this.amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }
}
