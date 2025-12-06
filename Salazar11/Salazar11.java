
/**
 * Write a description of class Salazar11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar11
{
    public static void main (String [] args) {
        
        int[] salz = {10, 21, 32, 50, 47};

        System.out.println("Even numbers and their indexes:");

        for (int r = 0; r < salz.length; r++) {
            if (salz[r] % 2 == 0) {  
                System.out.println(salz[r] + " is even at index " + r);
            }
        }
    }
}