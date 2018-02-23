//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;
   private String output="";
	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		for (int i =0;i<size+1;i++)
			{
			for (int j=size;j>i;j--){
				output = output + " ";}
			for (int k=0;k<i;k++){
				output = output +letter;}
			output = output+"\n";
			}
		return output;
	}

	public String toString()
	{
		return output+"\n";
	}
}