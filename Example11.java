//wap to print prime numbers from1-100
import java.util.Scanner;
 
class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    int count=0;
    System.out.println("Enter number to check it is prime or not");
    int num=s.nextInt();   // 50  --> 25       1- num/2
 
    for(int i=1;i<=num/2;i++){
      if(num%i==0){      // 50/25
        count++; 
      }
    }
    
    if(count==1){
      System.out.println("prime number");
    }    
    else{
      System.out.println("Not a prime number");
    }
    
  }
}

