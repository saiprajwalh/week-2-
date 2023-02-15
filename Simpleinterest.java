import java.util.Scanner;
public class Simpleinterest
{
    public static void main(String args[]) 
    {
        int a,b;     
        float p, r, t, sinterest;
         Scanner s = new Scanner(System.in);
        System.out.println("enter the montly income");
        a = s.nextInt();
        System.out.println("enter the yearly salary ");
        b = s.nextInt();
  
        
        System.out.println("Enter the Principal : ");
        p = s.nextFloat();
        System.out.println("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.println("Enter the Time period : ");
        t = s.nextFloat();
        s.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}