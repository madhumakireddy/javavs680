package edu.umb.cs680.HW13;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class ParetoComparatorTest 
{
	ArrayList<Car> ListOfCars = new ArrayList<Car>();

	@Test
	public void verify_ParetoComparator() 
	{
		ListOfCars.add(new Car("Audi", "Q5", 18, 2015, 150000));
		ListOfCars.add(new Car("BMW", "X5", 19, 2016, 144000));
		for (Car car : ListOfCars) 
		{
			car.setDominationCount(ListOfCars);
		}
		Collections.sort(ListOfCars, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());
		assertEquals(150000, ListOfCars.get(0).getPrice());
		assertEquals(144000, ListOfCars.get(1).getPrice());
	}
	
	@Test
	public void error_ParetoComparator() 
	{
		ListOfCars.add(new Car("Maserati", "Ghibli", 22, 2019, 78000));
		ListOfCars.add(new Car("Ford", "MustangGT", 21, 2018, 34000));
		for (Car car : ListOfCars) 
		{
			car.setDominationCount(ListOfCars);
		}
		Collections.sort(ListOfCars, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());
		assertNotEquals(11000, ListOfCars.get(0).getPrice());
		assertNotEquals(1000, ListOfCars.get(1).getPrice());
	}
}