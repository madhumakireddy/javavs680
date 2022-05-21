package edu.umb.cs680.HW12;

import java.util.Comparator;

public class ElementComparator implements Comparator<ApfsElement> 
{	
	public int compare(ApfsElement obj1, ApfsElement obj2) 
	{
		return obj1.getOwnerName().compareTo(obj2.getOwnerName());
	}
	
	public static void main(String[]args)
	{
		System.out.println("The Element comparator has been sucessfully created");
	}
}