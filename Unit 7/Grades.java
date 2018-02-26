//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private Double[] grades;
	int classes;
	
	public Grades(){
		
	}
	public Grades(int length,Double[] studentgrade){
		setGrade(length,studentgrade);
	}
	public void setGrade(int length,Double[] studentgrade){
		classes=length;
		grades =studentgrade;
		
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i=0;i<classes;i++)
			sum+=grades[i];


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/classes;
		


		return average;
	}
	public String toString(){
		String output ="";
		for (int i =0; i<grades.length;i++)
			output =  output + "\n" + "grade "+i +":: " + grades[i];
		return "\n"+  output + "\n \n" + "average = " + getAverage();	
		
	}



}



// conditionals with logic operations auto increments short cuts(++,--,*=) truth table 2*outputs