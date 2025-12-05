
/**
 * Write a description of class Salazar9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Salazar9
{
    public static void main (String [] args) {
        
        Scanner salz = new Scanner(System.in);
        int sum = 0;
        int number;
        
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = salz.nextInt();
            sum += number;
        } while (number != 0);
        
        System.out.println("The total sum is: " + sum);
        salz.close();
    }
}