
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        String mon = new String("Monday");
        String tue = new String("Tuesdey");
        String wed = new String("Wednesday");
        String thu = new String("Thursday");
        String fri = new String("Friday");
        String sat = new String("Saturday");
        String sun = new String("Sunday");
        String today = new String(" ");
        String nextday = new String(" ");
        System.out.print("Enter today's day: ");
        Scanner sn = new Scanner(System.in); 
        int input = sn.nextInt();
        System.out.print("Enter the number of days elapsed sinse today: ");
        Scanner sn1 = new Scanner(System.in); 
        int input1 = sn1.nextInt();
        if(input%7==0){
            today = sun;
        }
        if(input%7==1){
            today = mon;
        }
        if(input%7==2){
            today = tue;
        }
        if(input%7==3){
            today = wed;
        }
        if(input%7==4){
            today = thu;
        }
        if(input%7==5){
            today = fri;
        }
        if(input%7==6){
            today = sat;
        }
        if((input+input1)%7==0){
            nextday = sun;
        }
        if((input+input1)%7==1){
            nextday = mon;
        }
        if((input+input1)%7==2){
            nextday = tue;
        }
        if((input+input1)%7==3){
            nextday = wed;
        }
        if((input+input1)%7==4){
            nextday = thu;
        }
        if((input+input1)%7==5){
            nextday = fri;
        }
        if((input+input1)%7==6){
            nextday = sat;
        }
        System.out.println("Today is " + today + " and the future day is " + nextday);
    }
    
}
