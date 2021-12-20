/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pskma
 */
public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color, boolean filled) {
        this.setSide1(x1,x2,y1,y2);
        this.setSide2(x2,x3,y2,y3);
        this.setSide3(x3,x1,y3,y1);
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }
    
    public void setSide1(int x1,int x2,int y1,int y2) {
        double X = x1-x2;
        double Y = y1-y2;
        side1 = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        if (side1 <= 0) {
            System.err.println("Side1 can not be zero or negative");
            return;
        }
        this.side1 = side1;
    }

    public void setSide2(int x2,int x3,int y2,int y3) {
        double X = x2-x3;
        double Y = y2-y3;
        side2 = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        if (side2 <= 0) {
            System.err.println("Side2 can not be zero or negative");
            return;
        }
        this.side2 = side2;
    }

    public void setSide3(int x3,int x1,int y3,int y1) {
        double X = x3-x1;
        double Y = y3-y1;
        side3 = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        if (side3 <= 0) {
            System.err.println("Side3 can not be zero or negative");
            return;
        }
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public double getArea() {
        double s;
        s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
}
