import java.util.Scanner;
public class Lab01 {
    int age ; 
    double height ; 
    double weight ;
    String name ;
    double BMI ; 
    
    Lab01(String nameIn ,int ageIn ,double feet, double inches)
        {
            name = nameIn; 
            age = ageIn ;
            height = feet * 0.0254 ; // to meter 
            weight = inches * 0.45359237 ; // to kilo
            BMI = weight / (height * height);
            
        }
    
     void BmiNum()
     {       
         System.out.println("your bmi is : "+BMI);
     }
     
     String printBmi()
     {
         if(BMI<18.5)
         {
             return ("you are Underweight") ;
         }
         else if(BMI >=18.5 && BMI < 25.0)
         {
             return ("you are Normal") ;
         }
         else if(BMI >=25.0 && BMI < 30.0)
         {
            return ("you are Overweight") ;
         }
            else if(BMI >= 30.0)
         {
          return ("you are Obese") ;
         }
            
            else if (BMI < 0)
            {
            return ("error");
            }
            
            else
            {
            return ("error");
            }      
     }
      public static void main(String[] args)    
     {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String nameIn = sc.nextLine();
        System.out.print("Enter age : ");
        int ageIn = sc.nextInt();
        System.out.print("Enter height : ");
        double heightIn = sc.nextDouble();
        System.out.print("Enter weight : ");
        double weightIn = sc.nextDouble();
        Lab01 data = new Lab01( nameIn , ageIn , heightIn,  weightIn);
        data.BmiNum();
         System.out.println(data.printBmi());
                
    }
    
}