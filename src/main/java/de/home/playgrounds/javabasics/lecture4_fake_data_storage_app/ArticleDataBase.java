package de.home.playgrounds.javabasics.lecture4_fake_data_storage_app;

import java.util.ArrayList;

public class ArticleDataBase {
    private ArrayList<Article> articles = new ArrayList<>();

    public ArticleDataBase() {
        Article a1 = new Article("Lachsfilet", 20.08);
        Article a2 = new Article("Räucherschinken", 9.07);
        Article a3 = new Article("Donut", 1.77);
        Article a4 = new Article("Senf", 2.88);
        Article a5 = new Article("Tomatenmark", 4.50);
        articles.add(a1);
        articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void deleteArticle(Article article) {
        articles.remove(article);
    }
}
