import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        char[] character = {'a','b','c','d','e','f','g','h','i','j'};
        int numsec[] = new int[5];
        char afsec[]= new char[5];
        int number,M = 0,N = 0;
        int st= (int)(Math.random()*2);
        int In = 1;
        System.out.print("Random characters are : ");
        if(st == 0)
        {
            for(int i =0;i<10;i++)
            {
                number = (int) (Math.random()*10);
                if(i%2==0)
                {
                    System.out.print(character[number]);
                    afsec[M]=character[number];
                    M++;
                }  
                else
                {
                    System.out.print(num[number]);
                    numsec[M]=num[number];
                    N++;
                }
                System.out.print(" ");
            }
        }
        else if(st == 1)
        {
            for(int i =0;i<10;i++)
            {
                number = (int) (Math.random()*10);
                if(i%2==0)
                {
                    System.out.print(num[number]);
                    numsec[N]=num[number];
                    N++;
                }  
                else
                {
                    System.out.print(character[number]);
                    afsec[M]=character[number];
                    M++;
                }
                System.out.print(" ");
            }
        }
        System.out.print("\nSelect group of characters [1]sharacter or [2]numeric : ");
        Scanner R = new Scanner(System.in);
        int choose = R.nextInt();
        if(choose == 1)
        {
            System.out.print("\nCharacters not in the list are : ");
            for(int i = 0;i<10;i++)
            {
                In =1;
                for(int j = 0;j<5;j++)
                { 
                    if(character[i]==afsec[j]){In = 2;}
                }
                if(In == 1)
                {
                    System.out.print(character[i] + " ");
                }
            }  
        }
        if(choose == 2)
        {
            System.out.print("\nNumber not in the list are : ");
            for(int i = 0;i<10;i++)
            {
                In =1;
                for(int j = 0;j<5;j++)
                {  
                    if(num[i]==numsec[j]){In = 2;}
                }
                if(In == 1)
                {
                    System.out.print(num[i] + " ");
                }
                        
            }
        }
    }
}