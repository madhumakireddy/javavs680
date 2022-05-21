package edu.umb.cs680.HW11;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car>
{
	public int compare(Car car1, Car car2) 
	{
		return  (int) (car2.getPrice() -  car1.getPrice());
	}

	public static void main(String[] args)
	{
		System.out.println("The price comparator class has been sucessfully created");
	}
}