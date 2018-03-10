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
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count =new ArrayList<Integer>();
		letters = new ArrayList<Character>();


	}

	public Histogram(char[] values, String fName)
	{
		
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = fName;
		char[] searchletters = values;
		for (int i =0;i<searchletters.length;i++){
			letters.add(searchletters[i]);
		}





		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		
		for (int i =0; i<letters.size();i++){
			int occur =0;
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()){
				String filechar = file.next();
				for (int a = 0;a<filechar.length();a++){
					if(filechar.charAt(a)==letters.get(i)){
						occur=occur +1;
						
					}
				}
			}count.add(occur);
		}







	}

	public char mostFrequent()
	{

		int location =0;
		int greatestchar = count.get(0);
		for (int i =0;i <count.size();i++){
			if (greatestchar < count.get(i)){
				greatestchar = count.get(i);
				location = i;
			}
		}
		return letters.get(location);
	}

	public char leastFrequent()
	{

		int location =0;
		int smallestchar = count.get(0);
		for (int i =0;i <count.size();i++){
			if (smallestchar > count.get(i)){
				smallestchar = count.get(i);
				location = i;
			}
		}
		return letters.get(location);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}

}