package de.home.playgrounds.javabasics.exercise4_dataApp;

import java.util.ArrayList;

public class ProductRepository {

    private String connectionString = "jdbc:mysql://localhost:3306/";
    private String dataBaseName = "products";
    // set to null, to check if connected later, not null after DB has been created
    private ProductDataBase dataBase = null;

    public void connect() {
        System.out.println("Connecting to " + connectionString + " with Database " + dataBaseName);
        ProductDataBase productDataBase = new ProductDataBase();
        this.dataBase = productDataBase;
    }

    public boolean isConnected() {
        return this.dataBase != null;
    }

    public void purchaseProductById(String id) {
        ArrayList<Product> products = getAllProducts();

        for (Product element : products) {
            if (element.getId().equals(id)) {  // nur auf passendes product beziehen
                if (element.getAmountInStock() > 0) { // Produkte sind inStock
                    element.setAmountInStock(element.getAmountInStock() - 1);
                    System.out.println(element.getProductName() + " - purchase Successful. New amount in stock: " + element.getAmountInStock());
                } else {
                    System.out.println("Purchasing failed. 0 items in stock.");
                }
                return; // Stoppe Programm, nachdem Produkt gefunden wurde
            }
        }

        // An dieser Stelle kommt man an, wenn kein passendes produkt gefunden wurde
        System.out.println("Purchasing failed. Product ID not found.");
    }




    public String getDataBaseName() {
        return this.dataBaseName;
    }

    /*
    1. get all Products
    2. get Product By ID
    3. edit product
    4. delete product
     <>
     */


    public ArrayList<Product> getAllProducts() {
        //this(Diese Database) dataBase(verbundeneDatabase)
        //getProductsDataBase(Speichervermerk auf die Products ArrayList)
        return this.dataBase.getProductsDataBase();
    }

    public Product getProductById(String id) {
        //zuerst auf die gesamte Datenbank zugreifen
        // dann zu der passenden id filtern

        //erstelle eine container Arraylist nur für diese methode
        ArrayList<Product> products = getAllProducts();
        for (Product element : products) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public String addNewProduct(Product newProduct) {
        dataBase.addProductToDB(newProduct);
        System.out.println("New Product: " + newProduct.getProductName() + " created. ID: " + newProduct.getId());
        return newProduct.getId();
    }

    public boolean productExists(String id) {
        Product existingProduct = getProductById(id);
        if (existingProduct != null) {
            System.out.println(existingProduct.getProductName() + " ID: " + existingProduct.getId() + " exists");
            return true;
        } else {
            return false;
        }
    }

    public void deleteExistingProduct(Product product) {
        System.out.println("Deleting product " + product.getProductName() + " ID: " + product.getId());
        dataBase.deleteProductFromDB(product);
        System.out.println("Deletion Successful");
    }



}
