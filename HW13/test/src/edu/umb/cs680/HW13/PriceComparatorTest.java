package edu.umb.cs680.HW13;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PriceComparatorTest 
{
	List<Car> ListOfCars = new ArrayList<Car>();
	@Test
	public void verify_MileageComparator() 
	{		
		 ListOfCars.add(new Car("Audi", "Q5", 21, 2018, 5850000));
		 ListOfCars.add(new Car("BMW", "X5", 22, 2019, 7000000));
		 Collections.sort(ListOfCars,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice())); 
		 assertEquals(5850000,ListOfCars.get(0).getPrice());
		 assertEquals(7000000, ListOfCars.get(1).getPrice());
	}
	@Test
	public void error_MileageComparator() 
	{	
		 ListOfCars.add(new Car("Maserati", "Ghibli", 22, 2019, 78000));
		 ListOfCars.add(new Car("Ford", "MustangGT", 21, 2018, 34000));
		 Collections.sort(ListOfCars,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));
		 assertNotEquals(400,ListOfCars.get(0).getPrice());
		 assertNotEquals(7000, ListOfCars.get(1).getPrice());
	}
}