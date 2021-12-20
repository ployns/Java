
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
public class Lab04 {
    public static void main(String[] args) {
        System.out.println("Enter weight in pounds: ");
        Scanner w = new Scanner(System.in);
        double weight = w.nextDouble()* 0.45359237;
        System.out.println("Enter height in inches: ");
        Scanner h = new Scanner(System.in);
        double height = h.nextDouble()* 0.0254 ;
        double BMI = weight/(height*height);
        System.out.printf("BMI is %.4f", BMI);
    }
}
