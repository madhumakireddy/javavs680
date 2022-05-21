package edu.umb.cs680.HW11;

import java.util.Comparator;

public class ParetoComparator implements Comparator<Car> 
{		
		public int compare(Car car1, Car car2) 
		{
			if(car2.getPrice()>=car1.getPrice() && car1.getYear()>=car2.getYear() && car2.getMileage()>=car1.getMileage()) 
			{
				if(car2.getPrice()>car1.getPrice() || car1.getYear()>car2.getYear() || car2.getMileage()>car1.getMileage())
					return -1;
				return 0;
			}
			return 0;
		}
		
		public static void main(String[] args)
		{
			System.out.println("The pareto comparator class has been sucessfully created");
		}
}