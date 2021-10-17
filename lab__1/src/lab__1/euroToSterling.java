package lab__1;

import java.util.*;
public class euroToSterling
{
public static void main(String [] args)

{
	Scanner KeyboardIn = new Scanner(System.in);
	//Declare variables
	double euros, sterling, convRate;
	//Assign vales to variables
	System.out.print("how much Euros do you wish to convert to sterling:");
			euros = KeyboardIn.nextDouble();
			System.out.print("Enter todays's exchange rate:");
			convRate = KeyboardIn.nextDouble();
			sterling = euros*convRate;
			System.out.print("Euro"+euros+ "is worth sterling" +sterling);
}

}
