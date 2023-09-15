
/**
 * Class with main method that simulates rolling a die using the RecDieRoller class.
 * It calculates the mean number of rolls required to get a 2 over 1000 rolls.
 * 
 * @author [Your Name]
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		int totalRolls = 0;
        int numberOfRolls = 1000;//variable that is used for the times to perform the roll method
        
		RecDieRoller rec = new RecDieRoller();//create new instance of RecDieRoller
		//rec.roll();
		
		//for loop for rolling a die and calculates the total number of rolls it takes to get a 2
        for (int i = 0; i < numberOfRolls; i++) {
            int rollsToGet2 = rec.roll();//
            totalRolls += rollsToGet2;
        }

        double meanRolls = (double) totalRolls / numberOfRolls; //calculates the mean of rolls it took to get a 2
        System.out.println("Mean number of rolls to get a '2': " + meanRolls);
		
	}//end main

}//end class
