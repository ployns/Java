/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pskma
 */
public abstract class GeometricObject {

    public String color;
    public boolean filled = false;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter(); 

    public static double sumArea(GeometricObject[] a) {
        double sumArea = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof Circle){
                System.out.println("----------Circle---------");
                System.out.println("Radius = " + ((Circle)a[i]).getRadius());
                System.out.println("Color = " + ((Circle)a[i]).getColor());

            }
            else if(a[i] instanceof Rectangle){
                System.out.println("--------Rectangle-------");
                System.out.println("Height = " + ((Rectangle)a[i]).getHeight());
                System.out.println("Width = " + ((Rectangle)a[i]).getWidth());
                System.out.println("Color = " + ((Rectangle)a[i]).getColor());
            }
            else if(a[i] instanceof Triangle){
                System.out.println("--------Triangle-------");
                System.out.println("Side1 = " + ((Triangle)a[i]).getSide1());
                System.out.println("Side2 = " + ((Triangle)a[i]).getSide2());
                System.out.println("Side3 = " + ((Triangle)a[i]).getSide3());
                System.out.println("Color = " + ((Triangle)a[i]).getColor());

            }
            sumArea += a[i].getArea();
        }
        return sumArea;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + '}';
    }

}
