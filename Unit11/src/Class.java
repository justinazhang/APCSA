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
		int index =0;
		for (int i =0;i<studentList.size();i++){
			if(studentList.get(i).compareTo(studentList.get(i))==-1){
				index =i;
			}
		}





		return getStudentName(index);
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		int index=0;		
		for (int i =0;i<studentList.size();i++){
			if(studentList.get(i).compareTo(studentList.get(i))==1){
			index = i;
				
			}
		}






		return getStudentName(index);
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
	public void sort()

	{

		for (int i = 0; i < studentList.size()-1; i++) {

			for (int j = 0; j < studentList.size()-1; j++) {
				if(studentList.get(j).compareTo(studentList.get(j+1))==1)
				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j+1));
					studentList.set(j+1, temp);
				}

			}}

	}
}