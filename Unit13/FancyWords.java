//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{

	setWords(sentence);	
	}

	public void setWords(String sentence)
	{
	Scanner s = new Scanner(sentence);
	int count = 0;
	while(s.hasNext())
	{
		
		count++;
		s.next();
	}
				
	wordRay = new String[count];
	Scanner scan = new Scanner(sentence);
	int index = 0;
	while(scan.hasNext())
	{
		wordRay[index] = scan.next();
		index++;
	}
	
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < wordRay.length; i++) {
			if(max<wordRay[i].length())
			{
				max = wordRay[i].length();
			}
		}
		for (int i=0;i<wordRay.length;i++){
			System.out.println(wordRay[i]);
		}
		for (int i = 0; i < max; i++) {
			for (int j = wordRay.length-1; j >=0; j--) {
				if(wordRay[j].length()>i)
				{
					output+=wordRay[j].charAt(wordRay[j].length()-1-i);
				}
				else
				{
					output+=" ";
				}
			}
			output+="\n";
		}

		



		return output+"\n\n";
	}
}