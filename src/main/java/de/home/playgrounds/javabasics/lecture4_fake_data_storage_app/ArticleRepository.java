package de.home.playgrounds.javabasics.lecture4_fake_data_storage_app;

import java.util.ArrayList;

public class ArticleRepository {

    private String connectionString = "jdbc:mysql://localhost:3306/";
    private String dataBaseName = "articles";
    private ArticleDataBase dataBase = null;

    public void connect() {
        System.out.println("Connecting to " + connectionString + " with database " + dataBaseName);
        ArticleDataBase articleDataBase = new ArticleDataBase();
        this.dataBase = articleDataBase;
    }

    // Prüfen, ob die Eigenschaft dataBase null ist. Wenn nicht, sind wir connected
    // siehe connect() funktion
    public boolean isConnected() {
        return this.dataBase != null;
    }

    public String getDataBaseName() {
        return this.dataBaseName;
    }

    public ArrayList<Article> getAllArticles() {
        return this.dataBase.getArticles();
    }

    public Article getArticleById(String id) {
        ArrayList<Article> articles = getAllArticles();
        for (Article article : articles) {
            if (article.getId().equals(id)) {
                return article;
            }
        }
        return null;
    }

    // Viele add-Methoden in Repositories geben die Id des hinzugefügten Elements zurück aus Gründen
    public String addArticle(Article article) {
        dataBase.addArticle(article);
        return article.getId();
    }

    public boolean articleExists(String id) {
        Article existingArticle = getArticleById(id);
        if (existingArticle != null) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteArticle(Article article) {
        dataBase.deleteArticle(article);
    }
}
