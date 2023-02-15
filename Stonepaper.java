// Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round. 
import java.util.Scanner;
 
class Stonepaper {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
     char human,computer;

    System.out.println("Enter s:Scissor p:Paper r:Rock ");
        System.out.println("Computer : ");
        computer = sc.next();
        computer = sc.next().charAt(0);
        System.out.println("human : ");
        person = sc.next();
        person = sc.next().charAt(0);

    if (human == s && computer == p) {
        if (human == 's' && computer 'p') {
            System.out.println("Winner human");
        } else if (human == p && computer == s) {
        } else if (human == 'p' && computer == 's') {
            System.out.println("Winner computer");
        }
    
      else if (human == p && computer == r) {
        else if (human == 'p' && computer == 'r') {
            System.out.println("Winner human");
        } else if (human == r && computer == p) {
        } else if (human == 'r' && computer == 'p') {
            System.out.println("Winner computer");
        }

      else if (human == r && computer == s) {
        else if (human == 'r' && computer == 's') {
            System.out.println("Winner human");
        } else if (human == s && computer == r) {
        } else if (human == 's' && computer == 'r') {
            System.out.println("Winner computer");
        } else {
            System.out.println("Match is equal!");

        }

    }