import java.util.*;
class throwandthrows
{
    
      public static void main(String[] args) throws ArithmeticException
      {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          if(a<18 && a>0)
              throw new ArithmeticException("Underage");
          try
          {
              
              if(a==0)
              throw new ArithmeticException();
              System.out.println(1/a);
          }
          catch(ArithmeticException e)
          {
              System.out.println("Division by zero");
          }
      }
   
}