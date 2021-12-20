
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pskma
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        int x1,y1,x2,y2,x3,y3;
        String color, checkBoolean;
        boolean filled = false;
        
        //System.out.println("-----INPUT-----");
        // (x1,y1)
//        System.out.print("x1: ");
//        x1 = input.nextInt();
//        System.out.print("y1: ");
//        y1 = input.nextInt();
//        // (x2,y2)
//        System.out.print("x2: ");
//        x2 = input.nextInt();
//        System.out.print("y2: ");
//        y2 = input.nextInt();
//        // (x3,y3)
//        System.out.print("x3: ");
//        x3 = input.nextInt();
//        System.out.print("y3: ");
//        y3 = input.nextInt();
//        //  color
//        System.out.print("Color: ");
//        input.nextLine();
//        color = input.nextLine();
//        // check filled
//        System.out.print("Is it filled?(y/n): ");
//        checkBoolean = input.nextLine();
//
//        if ((checkBoolean.charAt(0) == 'y') || (checkBoolean.charAt(0) == 'Y')) {
//            filled = true;
//        } else if ((checkBoolean.charAt(0) == 'n') || (checkBoolean.charAt(0) == 'N')) {
//            filled = false;
//        }
//        Triangle tri = new Triangle(x1,y1,x2,y2,x3,y3, color, filled);
//
//        System.out.println("-----OUTPUT-----");
//        System.out.println("Side 1 = "+tri.getSide1());
//        System.out.println("Side 2 = "+tri.getSide2());
//        System.out.println("Side 3 = "+tri.getSide3());
//        System.out.println("Area: " + tri.getArea());
//        System.out.println("Perimeter: " + tri.getPerimeter());
//        System.out.println("Color: " + tri.getColor());
//        System.out.println("Is it filled: " + tri.getFilled());
             //12-02
        GeometricObject[] array = new GeometricObject[5];
        array[0]=new Circle(3,"red",true);
        array[1]=new Circle(1,"red",true);
        array[2]=new Rectangle(1,1,"white",true);
        array[3]=new Rectangle(1,1,"white",true);
        array[4]=new Triangle(0,0,3,0,3,4,"pink",true);
        System.out.println("**Sum of Area = " + GeometricObject.sumArea(array));
    }
}
