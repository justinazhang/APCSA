//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;
	
	//write a default Constructor
	public Monster(){
		setHeight(0);
		setWeight(0);
		setAge(0);
	}
	
	//write an initialization constructor with an int parameter ht
	public Monster(int height){
		setHeight(height);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int height,int weight){
		setHeight(height);
		setWeight(weight);
		setAge(0);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int height,int weight, int age){
		setHeight(height);
		setWeight(weight);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int height){
		myHeight = height;
	}
	public void setWeight(int weight){
		myWeight = weight;
	}
	public void setAge(int age){
		myAge = age;
	}
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;

		if (myHeight == rhs.getHeight() &&myWeight == rhs.getWeight() &&myAge == rhs.getAge())
			return true;
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (myHeight > rhs.getHeight())
			return 1;
		else if (myHeight < rhs.getHeight())
			return -1;
		else if (myWeight > rhs.getWeight())
			return 1;
		else if (myWeight < rhs.getWeight())
			return -1;
		else if (myAge > rhs.getAge())
			return 1;
		else if (myAge < rhs.getAge())
			return -1;
		else 
			return 0;


	}

	//write a toString() method
	public String toString(){
		return myHeight+" "+myWeight+" "+myAge;
	}
	
}