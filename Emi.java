import java.util.Scanner;
class Emi
{
    public static void main(String args[])
    {                
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();   
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        rate=rate/(12*100);
        System.out.print("Enter the month ");
        int month= input.nextInt();       
        double emi= (principal*rate*Math.pow(1+rate,month))/(Math.pow(1+rate,month)-1);
        System.out.print(" EMI is= "+emi+"\n");
                
    }
}