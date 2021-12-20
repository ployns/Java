
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P
 */
public class Lab02 {
    public static void main(String[] args) {
//        double a = 3.4;
//        double b = 50.2;
//        double c = 2.1;
//        double d = 0.55;
//        double e = 44.5;
//        double f = 5.9;
        System.out.print("a = ");
        Scanner g = new Scanner(System.in);
        double a = g.nextDouble();
        System.out.print("b = ");
        Scanner h = new Scanner(System.in);
        double b = h.nextDouble();
        System.out.print("c = ");
        Scanner i = new Scanner(System.in);
        double c = i.nextDouble();
        System.out.print("d = ");
        Scanner j = new Scanner(System.in);
        double d = j.nextDouble();
        System.out.print("e = ");
        Scanner k = new Scanner(System.in);
        double e = k.nextDouble();
        System.out.print("f = ");
        Scanner l = new Scanner(System.in);
        double f = l.nextDouble();
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        if(((a*d)-(b*c))!=0){
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        else {
            System.out.println("Error");
        }
    }
}
