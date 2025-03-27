package de.home.playgrounds.javabasics.exercise4_dataApp;

import java.util.ArrayList;

public class ProductDataBase {
    // <>
    private ArrayList<Product> productsDataBase = new ArrayList<>();

    public ProductDataBase() {
        Product p1 = new Product("Toybox", 5.95);
        Product p2 = new Product("Squishy Rat", 9.95);
        Product p3 = new Product("Dollhouse Wizardly", 45.95);
        Product p4 = new Product("Pokemon Card Pack", 12.95);
        Product p5 = new Product("Basketball", 14.95);
        Product p6 = new Product("Children`s Scooter", 190.95);
        Product p7 = new Product("Unicorn Costume", 18.95);
        Product p8 = new Product("Playdough Set", 20.95);

        productsDataBase.add(p1);
        productsDataBase.add(p2);
        productsDataBase.add(p3);
        productsDataBase.add(p4);
        productsDataBase.add(p5);
        productsDataBase.add(p6);
        productsDataBase.add(p7);
        productsDataBase.add(p8);
    }

    //ist nur ein getter um es nach außen sichtbar zu machen
    public ArrayList<Product> getProductsDataBase() {return productsDataBase;}

    public void addProductToDB(Product newProduct) {
        productsDataBase.add(newProduct);
    }

    public void deleteProductFromDB(Product product) {
        productsDataBase.remove(product);
    }



}
