//4. Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.import java.util.Scanner;

class Leap{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = 0;

      
        System.out.println("Enter Year to check leap year or not : ");
        year = sc.nextInt();

        if (year % 4 == 0)
            System.out.println(year + " is Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}
