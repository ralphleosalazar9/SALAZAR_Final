
/**
 * Write a description of class Salazar6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar6
{
    public static void main (String [] args) {
        
        int salz[] = {10, 13, 5, 22, 7, 30, 9};
        
        int sum = 0;
        int count = 0;
        
        for (int r = 0; r < salz.length; r++) {
            
            if (salz[r] % 2 !=0) {
                sum += salz[r];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average for odd numbers = " + average);
        } else {
            System.out.println("No odd numbers found! ");
        }
    }
}