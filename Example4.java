//WAP to check given number is amstrong number or not.
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number");
    int num=s.nextInt(); 
    int ams = 0;
  if (num!=0){
        ams=ams*num;   
    
   System.out.println("amstrong: "+ams);
    
    else
      System.out.println("not amstrong"+ams);
  
    
  }
}
}