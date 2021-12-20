/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pskma
 */
public class Rectangle extends GeometricObject {
    public double width;
    public double height;

    public Rectangle(double width, double height,String color,boolean filled) {
        this.setWidth(width);
        this.setHeight(height);
        this.setColor(color);
        this.setFilled(filled);
    }

    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Width can not be zero or negative");
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            System.err.println("Height can not be zero or negative");
            return;
        }
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public double getArea()
    {
        return width*height;
    }
    @Override
    public double getPerimeter()
    {
        return width*2+height*2;
    }
}
