public class Lab01

{
    public static void main(String[] args)
    {
        final int total = 100;
        
        int count = 1;
        int number = 2;     
        while (count <= total)
        {
              if (Prime(number) && Palindrome(number))
              {
                 System.out.print(number + " ");
                  if (count % 10 == 0)
                 System.out.println();

                 count++;
              }  
              number++;
        }
    }
    public static boolean Prime(int num)
    {
        if (num == 2)
           return true;
        for (int i = 2; i <= num-1; i++)
        {
            if (num % i == 0)
               return false;
        }
        return true;
    } 
    public static int reverse(int num)
    {
        int test = 0;

        while (num != 0) // 123
        {
           int lastdigit = num % 10;
              test = test * 10 + lastdigit; //321
              num = num / 10; // 12 1
        }
        return test; // 321
    }   
    public static boolean Palindrome(int num)
    {
        return num == reverse(num);
    }
}