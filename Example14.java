///alternative prime number
import java.util.Scanner;
 
class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    int count = 0,primecount=0;
 
    for (int k = 1; k <= 100; k++) { // k=1,2,3,4,5,6,7...100
 
      for (int i = 1; i <= k / 2; i++) { // 1<=1 count=2
        if (k % i == 0) { // 3%1
          count++;
        }
      }
 
      if (count == 1) {
           primecount++;
        if(primecount%2!=0){
        System.out.print(k + " "); // 2
        }
      }
      count = 0;
    }
 
  }
}

