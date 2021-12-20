import java.util.Random;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
         Random rand = new Random();
         int r = rand.nextInt(2);
         System.out.print("scissor (0), rock (1), paper (2): ");
         Scanner sn = new Scanner(System.in); 
         int input = sn.nextInt();
         
         
         
         
    if(input == 0){
       if(input-r == 0){
           System.out.print("The computer is scissor. You are scissor. You draw");
    
    }
        if(input-r == -1){
      System.out.print("The computer is rock. You are scissor. You lose");
    
    }
         if(input-r == -2){
      System.out.print("The computer is paper. You are scissor. You won");
    
    }
        
}
     if(input == 1){
       if(input-r == 0){
           System.out.print("The computer is  rock. You are  rock. You draw");
    
    }
        if(input-r == 1){
      System.out.print("The computer is paper. You are  rock. You lose");
    
    }
         if(input-r == -1){
      System.out.print("The computer is scissor. You are  rock. You won");
    
    }
        
}
     if(input == 2){
       if(input-r == 0){
           System.out.print("The computer is  paper. You are  paper. You draw");
    
    }
        if(input-r == 1){
      System.out.print("The computer is rock. You are  paper. You won");
    
    }
         if(input-r == 2){
      System.out.print("The computer is scissor. You are  paper. You lose");
    
    }
        
}
  if(input>2){
      System.out.print("ERROR\n");
  }
    }
}
