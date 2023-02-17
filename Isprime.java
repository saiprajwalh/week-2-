import java.util.Scanner;
 
class Isprime {
 
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
 
    Example1 obj = new Example1();
    obj.isPrime();
  }
}