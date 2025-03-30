package de.home.playgrounds.javabasics.exercise4_dataApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        System.out.println("Establishing connection to database " + productRepository.getDataBaseName());
        productRepository.connect();
        System.out.println("Connection successful: " + productRepository.isConnected());
        if (!productRepository.isConnected()) {
            System.out.println("Database connection failed: " + productRepository.getDataBaseName());
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        boolean userWantsToContinue = true;

        while (userWantsToContinue) {
            System.out.println("Wähle eine der folgenden Aktionen:");
            System.out.println("1: Alle Produkte auflisten");
            System.out.println("2: Produkte anhand Id aufrufen");
            System.out.println("3: Produkte hinzufügen");
            System.out.println("4: Prüfen, ob Produkt-Id existiert");
            System.out.println("5: Produkt anhand Id löschen");
            System.out.println("6: Produkt kaufen");

            String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1" -> {
                    ArrayList<Product> allProducts = productRepository.getAllProducts();
                    for (Product element : allProducts) {
                        System.out.println(element.getId() + ", " + element.getProductName() + ", " + element.getPrice() + "€" + " amount in stock: " + element.getAmountInStock());
                    }
                }
                case "2" -> {
                    System.out.println("Wähle eine ID aus: ");
                    String productIdInput = scanner.nextLine();
                    Product foundProduct = productRepository.getProductById(productIdInput);
                    if (foundProduct != null) {
                        System.out.println("Found product with id: " + foundProduct.getId());
                    } else {
                        System.out.println("Article with id: " + productIdInput + " not found");
                    }
                }
                case "3" -> {
                    System.out.println("Neues Produkt erstellen. Gebe ein Produktnamen ein: ");
                    String productNameInput = scanner.nextLine();
                    System.out.println("Gebe Preis als double ein");
                    double productPriceInput = Double.parseDouble(scanner.nextLine());
                    Product newProduct = new Product(productNameInput, productPriceInput);
                    productRepository.addNewProduct(newProduct);
                    System.out.println("Product " + newProduct.getProductName() + " erstellt mit der id: " + newProduct.getId());
                }
                case "4" -> {
                    System.out.println("Prüfen ob Produkt existiert mit ID: ");
                    String productId = scanner.nextLine();
                    boolean productExists = productRepository.productExists(productId);
                    if (productExists) {
                        System.out.println("Product with id " + productId + " exists.");
                    } else {
                        System.out.println("Product with id: " + productId + " not found");
                    }
                }
                case "5" -> {
                    System.out.println("Löschen vom Produkt mit der id: ");
                    String productId = scanner.nextLine();
                    if (productRepository.productExists(productId)) {
                        Product product = productRepository.getProductById(productId);
                        productRepository.deleteExistingProduct(product);
                        System.out.println("Produkt mit id " + productId + " " + product.getProductName() + " wurde gelöscht");
                    } else {
                        System.out.println("Ungültige Auswahl");
                        System.exit(1);
                    }
                }

                case "6" -> {
                    System.out.println("Kaufen von Produkt anhand der ID: ");
                    String productIdInput = scanner.nextLine();
                    if (productIdInput != null) {
                        productRepository.purchaseProductById(productIdInput);
                        System.out.println();
                    } else {
                        System.out.println("Fehler");
                    }

                }

            }

            System.out.println("Möchtest du eine weitere Aktion ausführen? (y/n)");
            if (scanner.nextLine().equals("y")) {
                userWantsToContinue = true;
            } else {
                System.out.println("Programm beendet :)");
                userWantsToContinue = false;
            }
        }

    }
}

