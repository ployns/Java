import java.util.Scanner;


public class Lab03 {
   

    public static void main(String[] args) {
        String mon = new String("Monday");
        String tue = new String("Tuesday");
        String wed = new String("Wednesday");
        String thu = new String("Thursday");
        String fri = new String("Friday");
        String sat = new String("Saturday");
        String sun = new String("Sunday");
    
              
        System.out.print("Enter year:(e.g., 2012): ");       
            Scanner sn = new Scanner(System.in); 
             int input = sn.nextInt();
        
         System.out.print("Enter month: 1-12: ");       
            Scanner tn = new Scanner(System.in); 
            int m = tn.nextInt();
        
            System.out.print("Enter the day of the month: 1-31: ");       
           Scanner n = new Scanner(System.in); 
              int q = n.nextInt();
        if(m == 1 )
               {
                   m = 13;
                   input-=1;          
               }
        else if ( m == 2)
               {
                   m = 14;
                   input-=1;
               }
         int j = input/100;
         int k = input%100;
         int  h = (q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j));
         h %= 7;
        int x = (int)h;
           
          
          switch (x) {
            case 0 -> System.out.printf("Day of the week is %s\n",sat);
            case 1 -> System.out.printf("Day of the week is %s\n",sun);
            case 2 -> System.out.printf("Day of the week is %s\n",mon);
            case 3 -> System.out.printf("Day of the week is %s\n",tue);
            case 4 -> System.out.printf("Day of the week is %s\n",wed);
            case 5 -> System.out.printf("Day of the week is %s\n",thu);
            case 6 -> System.out.printf("Day of the week is %s\n",fri);
            default -> {
            }
        }
}
}