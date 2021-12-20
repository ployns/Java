/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pskma
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.setRadius(radius);
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Radius can not be zero or negative");
            return;
        }
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" + "radius=" + radius + '}';
    }
}
