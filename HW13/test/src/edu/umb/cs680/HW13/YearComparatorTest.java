package edu.umb.cs680.HW13;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class YearComparatorTest 
{
	List<Car> ListOfCars = new ArrayList<Car>();
	@Test
	public void verify_MileageComparator() 
	{
		ListOfCars.add(new Car("Audi", "Q5", 18, 2019, 10000));
		ListOfCars.add(new Car("BMW", "X5", 19, 2020, 12000));
		Collections.sort(ListOfCars,(Car car1, Car car2) -> car1.getYear() - car2.getYear());
		assertEquals(2019, ListOfCars.get(0).getYear());
		assertEquals(2020, ListOfCars.get(1).getYear()); 
	}
	@Test
	public void error_MileageComparator() 
	{
		ListOfCars.add(new Car("Maserati", "Ghibli", 22, 2019, 78000));
		ListOfCars.add(new Car("Ford", "MustangGT", 21, 2018, 34000));
		Collections.sort(ListOfCars,(Car car1, Car car2) -> car1.getYear() - car2.getYear());
		assertNotEquals(2021, ListOfCars.get(0).getYear());
		assertNotEquals(2022, ListOfCars.get(1).getYear());
		 
	}
}