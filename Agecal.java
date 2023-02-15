//2. Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.Scanner;
class Age{
  public static void main(final String args[]){
    final Scanner s=new Scanner(System.in);
    System.out.println("Enter the DOY");
    int DOB;
    int b=0;
    DOB=s.nextInt();
    
    b=2023-DOB;
  if(b>18)
   System.out.println("age is" +b);
    {
   System.out.println("MINOR");
    }
  
  }
}