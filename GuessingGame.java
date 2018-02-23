//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;
public class GuessingGame
{
	private int upperBound;
	private int guess;
	private int randomint;
	private double percent;
	public GuessingGame(int stop)
	{

		upperBound=stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		randomint= rand.nextInt(upperBound)+1;
		int userguess = 0;
		guess =0;
		do 
		{
			System.out.print("Enter a number between 1 and "+upperBound+ ":" );
			userguess = keyboard.nextInt();
			if (userguess <1 || userguess > upperBound) 
				System.out.println("Out of range");
			else
				guess = guess +1;
		}while (randomint != userguess);




	}

	public String toString()
	{	
		
		percent = ((double)guess-1)/(double)guess*100;
		String output="It took "+guess+" guesses to guess " +randomint +"\n"+"You guessed wrong " + percent + " percent of the time.";
		
		return output;
	}
}