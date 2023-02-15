//3. Grade Calculator: Create an application that takes a student's test scores and calculates their final grade. Use conditional statements to determine the letter grade (e.g. A, B, C, etc.) based on their scores.
import java.util.Scanner;
class Grade{
  public statuc void main(String args[]){
    Scanner s = new Scanner(System.in);
    int computers,chemistry,english,physics,math;
    float total,Percentage;

    System.out.println("Enter the five subjects marks :");
    computers = s.nextInt();
    chemistry = s.nextInt();
    english = s.nextInt();
    physics = s.nextInt();
    math = s.nextInt();

    total = computers + chemistry + english + physics + math;
    Percentage = (total / 500)*100;

    
    System.out.println("Total Marks ="+total);
    System.out.println("Marks Percentage = "+Percentage);


    
    if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}
}
}