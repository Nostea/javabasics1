package de.home.playgrounds.javabasics.exercise27_override;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        super(radius);
        this.radius = radius;
    }

    @Override
    public  void calcSurface(int radius) {
        System.out.println(Math.PI * radius * radius);
    }

}
