//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{

		quickSort(list,0, list.length-1);


	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		
		if (low<high){
			int partit = partition(list,low,high);
			System.out.println("pass "+ passCount++ +" "+Arrays.toString(list));
			quickSort(list, low, partit);
			quickSort(list, partit+1,high);
		}
		


		


	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		int beg = low-1;
		int end = high+1;
		
		while(beg<end)
		{
			while(list[--end].compareTo(pivot)>0){
				int hi=1;
			}
			while(list[++beg].compareTo(pivot)<0){
				int hi=2;
			}
			if(beg>=end)
			{
				return end;
			}
			Comparable temp = list[beg];
			list[beg] = list[end];
			list[end]= temp;
			
		}
		
		return 0;
		
	}
	public static void reset(){
		passCount=0;
	}
}