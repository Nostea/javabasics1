package de.home.playgrounds.javabasics.lecture4_fake_data_storage_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ArticleRepository articleRepository = new ArticleRepository();
        System.out.println("Establishing connection to database " + articleRepository.getDataBaseName());
        articleRepository.connect();
        System.out.println("Connection successful: " + articleRepository.isConnected());
        if (!articleRepository.isConnected()) {
            System.out.println("Database connection failed: " + articleRepository.getDataBaseName());
            System.exit(1);
        }
        Scanner scanner = new Scanner(System.in);
        boolean userWantsToContinue = true;
        while(userWantsToContinue) {
            System.out.println("Wähle eine der folgenden Aktionen:");
            System.out.println("1: Alle Artikel auflisten");
            System.out.println("2: Artikel anhand Id aufrufen");
            System.out.println("3: Artikel hinzufügen");
            System.out.println("4: Prüfen, ob Artikel-Id existiert");
            System.out.println("5: Artikel anhand Id löschen");

            String userChoice = scanner.nextLine();
            if (userChoice.equals("1")) {
                ArrayList<Article> allArticles = articleRepository.getAllArticles();
                for (Article element : allArticles) {
                    System.out.println(element.getId() + ", " + element.getName() + ", " + element.getPrice() + "€");
                }
            } else if (userChoice.equals("2")) {
                System.out.print("Bitte gib eine Id ein: ");
                String id = scanner.nextLine();
                Article foundArticle = articleRepository.getArticleById(id);
                if (foundArticle != null) {
                    System.out.println("Found article with id " + foundArticle.getId() + ": " + foundArticle.getName() + ", " + foundArticle.getPrice() + "€");
                } else {
                    System.out.println("Article with id " + id + " not found");
                }
            } else if (userChoice.equals("3")) {
                System.out.print("Bitte gib einen Artikelnamen ein: ");
                String articleName = scanner.nextLine();
                System.out.print("Bitte gib einen Artikelpreis: ");
                double articlePrice = Double.parseDouble(scanner.nextLine()); // next double macht probleme, daher parsen wir nen String zu nem double
                Article article = new Article(articleName, articlePrice);
                articleRepository.addArticle(article);
                System.out.println("Article was added to the database");
            } else if (userChoice.equals("4")) {
                System.out.print("Bitte gib eine Id ein: ");
                String id = scanner.nextLine();
                boolean articleExists = articleRepository.articleExists(id);
                if (articleExists) {
                    System.out.println("Article with id " + id + " exists!");
                } else {
                    System.out.println("Article with id " + id + " not found");
                }
            } else if (userChoice.equals("5")) {
                System.out.print("Bitte gib eine Id ein: ");
                String id = scanner.nextLine();
                if (articleRepository.articleExists(id)) {
                    Article article = articleRepository.getArticleById(id);
                    articleRepository.deleteArticle(article);
                    System.out.println("Article with id " + id + " got deleted!");
                } else {
                    System.out.println("Article with id " + id + " not found!");
                }
            } else {
                System.out.println("Invalid choice");
                System.exit(1);
            }
            System.out.println("Möchtest du eine weitere Aktion ausführen? (yes/no)");
            if (scanner.nextLine().equals("yes")) {
                userWantsToContinue = true;
            } else {
                System.out.println("Cyaaaa!");
                userWantsToContinue = false;
            }
        }
    }
}
