import java.util.Scanner;
public class two {
 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Input size of matrix: ");
  int size = input.nextInt();              
  int top = 1 , right = 1,bottom = 1 , left = 1; 
  int[][] matrix = new int[size+1][size+1];
        int m=0,n=0;
   while(size>=5){
        if(size<5) { 
        }
        else {
         System.out.println("Random matrix: ");
         for(int i=0;i<=size-1;i++){
                for(int j=0;j<=size-1;j++){
                    matrix[i][j] = 0+(int)(Math.random()*10);
                    System.out.printf("%d ",matrix[i][j]);
                    
                }
                System.out.printf("\n");
            }
        }
             System.out.print("Input value of Row and Colum: ");
                int p = input.nextInt();
                int q = input.nextInt();
                m = p;
                n = q;
            System.out.println("Selected member is "+matrix[p][q]);
            System.out.print("Top = ");
            if(m==0) {
             System.out.print("No");
                System.out.println("");
            }
            else {
             for(int number=m-1;number>=0;number--) {    
             top *= matrix[number][n];     
             }         
            System.out.println(top);        
            }
            System.out.print("Right: ");
            if(n==size-1) {
             System.out.print("No");
                System.out.println("");
            }
            else {
             for(int number=n+1;number<=size-1;number++) {
              right *= matrix[m][number];
             }
            System.out.println(right);
            }

            System.out.print("Bottom: ");
            if(m==size-1) {
             System.out.print("No");
                System.out.println("");
            }
            else {
             for(int number=m+1;number<=size-1;number++) {
              bottom *= matrix[number][n];
              
             }
                 
            System.out.println(bottom);
            
            }
            
            System.out.print("Left: ");
            if(n==0)
            {
                System.out.println("NO");
                System.out.println("");
            }else {
                for(int number=n-1 ; number>=0 ; number--){
                    left *= matrix[m][number];
                }
               
            System.out.println(left);
            
            }
                   
            System.out.println("End of program.");
 }
   System.out.println("error");
 }
 

}