//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover(String s,char rem)
	{
		sentence =s;
		lookFor = rem;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc =sentence.indexOf(lookFor);
			cleaned = cleaned.substring(0, loc)+cleaned.substring(loc+1);
		while (loc != -1)
			cleaned = cleaned.substring(0, loc)+cleaned.substring(loc);
			loc =sentence.indexOf(lookFor);
			




		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+"\n"+removeLetters();
	}
}