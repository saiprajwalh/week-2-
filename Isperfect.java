import java.util.Scanner;
 
class Example1 {
 
  public void isPerfect() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to check it is perfect or not");
    int num = s.nextInt();
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println("perfect number");
    } else {
      System.out.println("not a perfect number");
    }
  }
 
  public void isPrime() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to check it is prime or not");
    int num = s.nextInt();
    int fc = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        fc++;
      }
    }
    if (fc == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
  }
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    Example1 obj = new Example1();
    
    System.out.println("1. To check prime numebr");
    System.out.println("2. To check perfect numebr");
     System.out.println("Choose your option: ");
    int option=s.nextInt();
    if(option==1){
    obj.isPrime();  
    }
    else if(option==2){
    obj.isPerfect();  
    }
    else{
      System.out.println("invalid option");
    }
    
    
    
  }
}