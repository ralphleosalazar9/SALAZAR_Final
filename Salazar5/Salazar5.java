
/**
 * Write a description of class Salazar5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar5
{
    public static void main (String [] args) {
        
        int [] nums = {10, 20, 35, 40, 50};
        
        int search = 36;
        
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == search) {
                System.out.println(search + "found at index " + r);
                break;
            }
        }
    }
}