//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{


	}

	public LoopStats(int beg, int end)
	{
		start = beg;
		stop =end;

	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop =end;

	}

	public int getEvenCount()
	{
		
		int evenCount=0;
		for (int i=start;i<stop;i=i+1)
			if (i%2==0)
				evenCount=evenCount+1;


		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;

		for (int i=start;i<stop;i=i+1)
			if (i%2==1)
				oddCount=oddCount+1;



		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int i =start;i<stop+1;i++)
			total = total +i;



		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}