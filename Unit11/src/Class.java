//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
public class Class
{
	private String names;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		names="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		names = name;
		studentList=new ArrayList<Student>();
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum,s);

	}
	
	public String getClassName()
	{
	   return names;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i =0;i<studentList.size();i++){
			classAverage=studentList.get(i).getAverage()+classAverage;}
		classAverage=classAverage/studentList.size();


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0.0;
		for (int i=0;i<studentList.size();i++){
			if (studentList.get(i).getName().equals(stuName)){
				average = studentList.get(i).getAverage();
			}
		}
		return average;

	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i =0;i<studentList.size();i++){
			if(studentList.get(i).getAverage()>high){
				hName=studentList.get(i).getName();
				high = studentList.get(i).getAverage();
			}
		}





		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";		
		for (int i =0;i<studentList.size();i++){
			if(low>studentList.get(i).getAverage()){
				lName=studentList.get(i).getName();
				low = studentList.get(i).getAverage();
				
			}
		}






		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i =0;i<studentList.size();i++){
			if(studentList.get(i).getAverage()<failingGrade)
				output=output + " " + studentList.get(i).getName();
		}




		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (int i = 0; i < studentList.size(); i++) {
			output+= studentList.get(i) +"\t"+ getStudentAverage(i)+"\n";
		}


		return output;
	}  	 	
}