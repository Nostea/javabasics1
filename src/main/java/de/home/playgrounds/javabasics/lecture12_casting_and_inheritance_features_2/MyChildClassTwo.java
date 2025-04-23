package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

public class MyChildClassTwo extends MyParentClass {

    private String myStringAttribute;

    public MyChildClassTwo(int myIntAttribute) {
        super(myIntAttribute);
        myStringAttribute = "MyChildClassTwo";
    }

    public String getMyStringAttribute() {
        return myStringAttribute;
    }

    public void setMyStringAttribute(String myStringAttribute) {
        this.myStringAttribute = myStringAttribute;
    }

    @Override
    public String toString() {
        return "MyChildClassTwo [myStringAttribute=" + myStringAttribute + "]";
    }
}
