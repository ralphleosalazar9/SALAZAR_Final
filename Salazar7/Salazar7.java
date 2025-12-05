
/**
 * Write a description of class Salazar7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar7
{
    public static void main(String [] args) {
        
        int [] salz = {-5, 10, -3, 7, -20, 15};
        
        System.out.println("Original values: ");
        
        for (int r = 0; r < salz.length; r++) {
            System.out.print(salz[r] + " ");
        }
        
        System.out.println("\n\nConverting negative to positive...");
         
        for (int r = 0; r < salz.length; r++) {
            if (salz[r] < 0) {
                salz[r] = -salz[r];
            }
        }
        
        System.out.println("\nNew values: ");
        for (int r = 0; r < salz.length; r++) {
            System.out.print(salz[r] + " ");
        }
    }
}