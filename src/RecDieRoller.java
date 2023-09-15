
import java.util.Random;
/**
 * Class that uses a recursive method to simulate a die roll.
 * Generates rolls until a 2 is rolled and counts how many rolls it took.
 * Prints the number of every roll.
 * @author cstirneman
 *
 */
public class RecDieRoller {

	Random random = new Random();
	
	/**
     * Simulates a die roll and counts the number of rolls it took to get a 2.
     * 
     * @return The number of rolls it took to get a 2.
     */
	public int roll() {
		int die = random.nextInt(6) + 1;//generate random number between 1 and 6
        System.out.println(die);//print the random number

        if (die != 2) {
            return 1 + roll();//counts the number of rolls it takes to get a 2
        }//end if

        return 1;//returns the number of rolls it took to get a 2
	}//end roll method
	
}//end class
