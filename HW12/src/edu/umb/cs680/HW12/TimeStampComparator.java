package edu.umb.cs680.HW12;

import java.util.Comparator;
public class TimeStampComparator implements Comparator<ApfsElement>
{
	public int compare(ApfsElement obj1, ApfsElement obj2) 
	{
		return obj2.getLastModified().compareTo(obj1.getLastModified());
	}
	
	public static void main(String[]args)
	{
		System.out.println("The time stamp comparator has been sucessfully created");
	}
}