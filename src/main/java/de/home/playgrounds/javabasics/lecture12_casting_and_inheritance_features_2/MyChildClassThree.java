package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

public class MyChildClassThree extends MyParentClass {

    private String myStringAttribute;
    private MyEntity myEntity;

    public MyChildClassThree(int myIntAttribute, String myStringAttribute, MyEntity myEntity) {
        super(myIntAttribute);
        this.myStringAttribute = myStringAttribute;
        this.myEntity = myEntity;
    }

    public String getMyStringAttribute() {
        return myStringAttribute;
    }

    public void setMyStringAttribute(String myStringAttribute) {
        this.myStringAttribute = myStringAttribute;
    }

    @Override
    public String toString() {
        return "MyChildClassThree [" +
                "myStringAttribute='" + myStringAttribute + "', " +
                "myEntity=" + myEntity +
                "] extends " + super.toString();
    }
}
