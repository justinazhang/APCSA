import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private boolean[][] spot;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
		spot = new boolean[10][10];
	}

	public int countAts(int r, int c)
	{

		
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(r>=0&&c>=0&&  r<atMat.length && c<atMat[atMat.length-1].length&&spot[r][c]!=true&&atMat[r][c]=='@')
		{
			spot[r][c]= true;
			atCount++;
			countAts(r, c+1);
			countAts(r, c-1);
			countAts(r+1, c);
			countAts(r-1, c);
			
			
		}
		
		
		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		for (boolean[] rows: spot) {
			for (boolean columns:rows) {
				columns= false;
			}
			
			
		}
		atCount = 0;
		return output;
		
	}
}