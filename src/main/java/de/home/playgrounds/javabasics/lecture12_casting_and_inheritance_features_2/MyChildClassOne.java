package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

public class MyChildClassOne extends MyParentClass {

    private boolean aBooleanAttribute;

    public MyChildClassOne(int myIntAttribute) {
        super(myIntAttribute);
        aBooleanAttribute = true;
    }

    public void setABooleanAttribute(boolean aBooleanAttribute) {
        this.aBooleanAttribute = aBooleanAttribute;
    }

    public boolean isABooleanAttribute() {
        return aBooleanAttribute;
    }
}
