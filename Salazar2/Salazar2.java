
/**
 * Write a description of class Salazar2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar2
{
    public static void main (String [] args) {
        int [] numbers = {1, 7, 3, 7, 4, 7, 8, 7, 5, 7,};
        
        int count = 0;
        
        for (int r = 0; r < numbers.length; r++) {
            if (numbers [r] == 7) {
                count++;
            }
        }
        System.out.println("The number 7 appears " + count + " times.");
    }
}