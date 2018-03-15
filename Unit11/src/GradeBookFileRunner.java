//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
	
   public static void main( String args[] ) throws Exception
   {
	   ArrayList<Class> classes =new ArrayList<Class>();
		out.println("Welcome to the Class Stats program!");
		int i =0;
		Scanner file = new Scanner(new File("H://Unit11//src//gradebook.dat"));
		String name =file.nextLine(); 
		int size=file.nextInt();
		file.nextLine();
		Class newClass = new Class(name,size);
		classes.add(newClass);
		for(int j =0;j<size;j++){
		String stuname= file.nextLine();
		String stugrade= file.nextLine();
		classes.get(0).addStudent(i, new Student(stuname,stugrade));	
		
		i++;}
		out.print(classes.get(0));
		out.println("");
		out.println("Failure List = "+ classes.get(0).getFailureList(70));
		out.println("Highest Average = "+classes.get(0).getStudentWithHighestAverage());
		out.println("Lowest Average = " +classes.get(0).getStudentWithLowestAverage());
		out.println("Class Average = " +classes.get(0).getClassAverage());
	}
 }











