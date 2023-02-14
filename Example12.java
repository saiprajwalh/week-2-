import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int year = 0;
        System.out.println("Enter Year to check leap year or not : ");
        year = sc.nextInt();
      if (year % 4 == 0)
            System.out.println(year + " is Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}