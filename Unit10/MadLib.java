//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String word = "";
	public MadLib()
	{

	}

	public MadLib(String fileName)
	{
		nouns = new ArrayList<String>();
		verbs = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		loadNouns();
		loadAdjectives();
		loadVerbs();
		try{
			
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				word += file.next() +" ";
				
			}}
			catch(Exception e)
			{
				out.println("Houston we have a problem!");
				
			}
			
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner file = new Scanner(new File("nouns.dat"));
			while (file.hasNextLine()){
				nouns.add(file.nextLine());
			}
		
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
			
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner file = new Scanner(new File("verbs.dat"));
			while (file.hasNextLine()){
				verbs.add(file.nextLine());
			}
	
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
			
		}
	}

	public void loadAdjectives()
	{
		try{
	
			Scanner file = new Scanner(new File("adjectives.dat"));
			while (file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
	
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
			
		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		int j = r.nextInt(verbs.size());
		return  verbs.get(j);
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		int j = r.nextInt(nouns.size());
		return  nouns.get(j);
	}
	
	public String getRandomAdjective()
	{
		Random r = new Random();
		int j = r.nextInt(adjectives.size());
		return  adjectives.get(j);
	}		
	
	public String toString()
	{
		
			for (int i =0; i<word.length();i++){
			String nextword = Character.toString(word.charAt(i));	

			if (nextword.equals("#"))
					word = word+ getRandomNoun()+ " ";
			else if (nextword.equals("@"))
				word = word+ getRandomNoun()+ " ";
			if (nextword.equals("&"))
				word = word+ getRandomNoun()+ " ";
					
		}
	   return word;
	}
}