
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
public class Lab01 {
    public static void main(String[] args) { // psvm
//        int result = 0;
//        result = 1 + 2;
//        System.out.println(result); // sout
//        System.out.println("result of " + "1+2=" + result);
//        result 0f 1+2=3   
//        Scanner sn = new Scanner(System.in);
//        int x = sn.nextInt();
        
        int b = 31536000/7;
        int d = 31536000/13;
        int m = 31536000/45;
        int y1 = 312032486;
        int y2 = y1 + b - d + m;
        int y3 = y2 + b - d + m;
        int y4 = y3 + b - d + m;
        int y5 = y4 + b - d + m;

        System.out.println("year1 = " + y1);
        System.out.println("year2 = " + y2);
        System.out.println("year3 = " + y3);
        System.out.println("year4 = " + y4);
        System.out.println("year5 = " + y5);

    }
}
