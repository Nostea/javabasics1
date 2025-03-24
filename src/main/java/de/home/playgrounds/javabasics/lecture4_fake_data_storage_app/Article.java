package de.home.playgrounds.javabasics.lecture4_fake_data_storage_app;

import java.util.UUID;

public class Article {
    private String id;
    private String name;
    private double price;

    public Article(String name, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
