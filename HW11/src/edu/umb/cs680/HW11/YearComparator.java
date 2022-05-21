package edu.umb.cs680.HW11;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> 
{
	public int compare(Car car1, Car car2) 
	{
		return car1.getYear() - car2.getYear();
	}
	
	public static void main(String[] args)
	{
		System.out.println("The year comparator class has been sucessfully created");
	}
}