// WAP to print palindrome  of a given number.
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number");
    int num=s.nextInt(); 
    int pal=0;
    
     if (num!=0){
        pal=pal*1+(num%10); 
       num=num/10;  
    }
   System.out.println("palindrome: "+pal);
    {
    else
      System.out.println("not palindrom"+pal);
    }
    
  }
}