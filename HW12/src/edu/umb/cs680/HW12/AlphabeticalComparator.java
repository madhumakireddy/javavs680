package edu.umb.cs680.HW12;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<ApfsElement>
{
	public int compare(ApfsElement obj1, ApfsElement obj2) 
	{
		return obj1.getName().compareTo(obj2.getName());
	}
	
	public static void main(String[]args)
	{
		System.out.println("The alphabetical comparator has been sucessfully created");
	}
}