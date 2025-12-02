
/**
 * Write a description of class salazar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class salazar1
{
    public static void main (String [] args) {
        Scanner r = new Scanner(System.in);
        int number = 0;
        
        while (number < 1 || number > 100) {
            System.out.print("Enter a number between 1 and 100: ");
            if (r.hasNextInt()) {
                number = r.nextInt();
                if (number < 1 || number > 100) {
                    System.out.println("Number out of reach try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                r.next();
            }
        }
        
        System.out.println("You entered a valid number: " + number);
    }
}