package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

public class MyEntity {
    private int id;

    public MyEntity(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyEntity [" + "id=" + id + "]";
    }
}
