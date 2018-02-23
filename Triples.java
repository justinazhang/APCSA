import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

		setNum(num);
	}

	public void setNum(int num)
	{

		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		
		int greatest = 1;
		for (int i = 1; i < c; i++) {
			if(a%i == 0  && b%i == 0 && c%i == 0)
			{
				greatest = i;
			}
		}



		return greatest;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i < number; i++) {
			for (int j = 1; j < number; j++) {
				for (int y = 0; y < number; y++) {
					if(Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(y, 2))
					{
						if(y%2!=0 && ((i%2==0 && j%2!=0 ) ||(i%2!=0 && j%2==0)))
						{
							if(y>j &&j>i && y>i)
							if(greatestCommonFactor(i,j,y)<=1)
								{
									output=output + i+" "+j+" "+y+"\n";
								}
							
						}
					}
				}
			}
		}





		return output+"\n";
	}
}