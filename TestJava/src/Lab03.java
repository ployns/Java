
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
public class Lab03 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000 : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = num/100 + (num%100)/10 + (num%100)%10;
        if(num>0&&num<1000){
           System.out.println("The sum of the digits is " + result);
        }
        else{
            System.out.println("Error");
        }
    }
}
