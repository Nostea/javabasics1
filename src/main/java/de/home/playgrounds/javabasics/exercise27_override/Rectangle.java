package de.home.playgrounds.javabasics.exercise27_override;

public class Rectangle extends Shape {

    public Rectangle(int length) {
        super(length);
    }

    @Override
    public void calcSurface(int length) {
        if(length >= 0 ) {
            int surface = length * length;
            System.out.println("Rectangle surface area: " + surface);
        }
    }

}
