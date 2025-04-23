package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

public class MyParentClass {

    private int myIntAttribute;

    public MyParentClass(int myIntAttribute) {
        this.myIntAttribute = myIntAttribute;
    }

    public int getMyIntAttribute() {
        return myIntAttribute;
    }

    @Override
    public String toString() {
        return "MyParentClass [" +
            "myIntAttribute=" + myIntAttribute +
            ']';
    }
}
