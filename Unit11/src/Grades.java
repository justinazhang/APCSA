//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
public class Grades
{
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String grades)
	{
		setGrades(grades);		
	}
	
	public void setGrades(String gradelist)
	{
		Scanner chopper = new Scanner(gradelist);
		grades =new ArrayList<Double>();
		chopper.next();
		chopper.next();
		while (chopper.hasNextDouble()){
			grades.add(chopper.nextDouble());
		}


	}
	
	public void setGrade(int spot, double grade)
	{
		grades.add(spot,grade);


	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i =0;i<grades.size();i++){
			sum+=grades.get(i);
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i =0;i<grades.size();i++){
			if (low>grades.get(i)){
				low = grades.get(i);
			}
			
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i =0;i<grades.size();i++){
			if (high<grades.get(i)){
				high = grades.get(i);
			}
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i =0;i<grades.size();i++){
			output+=grades.get(i)+" ";
		}




		return output;
	}	
}