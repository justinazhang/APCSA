//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing game-how many numbers?");
		int response =keyboard.nextInt();
		GuessingGame game = new GuessingGame(response);
		game.playGame();
		out.println(game);
		System.out.println("Would you like to play again");
		Scanner keyboard2 = new Scanner(System.in);
		String answer = keyboard.next();
		String answer1 = null;
		while (answer.equals("yes")||answer1.equals("yes"))
		{
			System.out.println("Guessing game-how many numbers?");
			int response1 =keyboard.nextInt();
			GuessingGame game1 = new GuessingGame(response1);
			game1.playGame();
			out.println(game1);
			System.out.println("Would you like to play again");
			answer1 = keyboard.next();
			answer="no";
		}

	}
}