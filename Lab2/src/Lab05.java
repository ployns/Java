import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {

    System.out.print("Enter the number of line : ");
    Scanner sn = new Scanner(System.in); 
    int input = sn.nextInt();
    for(int i=1;i<=input;i++){
        
        for(int j=input;j>=i;j--){
         System.out.print("  ");
        }
        
     for(int j=1;j<=i;j++){
        if( j<=i){
            int y=i+1-j;
            System.out.printf("%d ",y);
         } 
     }
     
      for(int j=2;j<=i;j++){
      System.out.printf("%d ",j);
     }

     System.out.print("\n");
    } 

}
 
}