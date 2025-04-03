package de.home.playgrounds.javabasics.lecture5_equality_and_identity;

public class Article {
    private String id;
    private String name;

    public Article(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean isDatabaseEquals(Article a2) {
        return this.id.equals(a2.id);
    }

    public static boolean databaseCompare(Article a1, Article a2) {
        return a1.id.equals(a2.id);
    }

    /**
     * Vergleicht alle Werte vom Artikel mit allen WErten des reingereichten Artikels und gibt
     * true zurÃ¼ck, wenn alle Werte gleich sind.
     * @param a2 Der andere Artikel
     * @return true, falls alles gleich. false wenn nicht.
     */
    public boolean isTrueEquals(Article a2) {
        return this.id.equals(a2.id) && this.name.equals(a2.name);
    }

    // TODO: AND NOW: The real way to deal with equals
    @Override
    public boolean equals(Object obj) {
        System.out.println("hello, ich vergleiche custom");
        Article a = (Article) obj; // Classcast, Umwandeln von Klasse 1 in Klasse 2 kann exceptions werfen
        return this.name.equals(a.name) && this.id.equals(a.id);
    }
}
