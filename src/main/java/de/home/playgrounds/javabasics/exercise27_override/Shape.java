package de.home.playgrounds.javabasics.exercise27_override;

public class Shape {

    public int length;

    public Shape(int length) {
        this.length = length;
    }

    public void calcSurface(int length) {
        if(length <= 0) {
            System.out.println("shape has no surface area");
        }

    }


}
