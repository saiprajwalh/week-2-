import java.util.Scanner;
class Example4 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int  salary=0 ,shp1=0, shp2 =0, shp3 =0;
    int total = 0;
    float percentage =0;
 
    System.out.println("Enter 3 shopping bils");
    shp1=s.nextInt();
    shp2=s.nextInt();
    shp3=s.nextInt();
    
    total = shp1 + shp2 + shp3;
    percentage =(total/100)*salary;
 
    System.out.println("total shopping is : " + total);
    System.out.println("percentage is : " + percentage);
    System.out.println("salary is : " + salary);
 
  }
}