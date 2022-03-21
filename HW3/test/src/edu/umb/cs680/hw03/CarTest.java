package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class CarTest {

	private String[] carToStringArray(Car car) {
		String[] car_arr = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return car_arr;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() {
		String[] exp1 = {"Toyota", "RAV4", "2018"};
		String[] exp2 = {"ferrari", "SF90 Spider", "2019"};
		Car act1 = new Car("Toyota", "RAV4", 2018, 1500, 250000);
		Car act2 = new Car("ferrari", "SF90 Spider", 2019, 1500, 250000);
		assertArrayEquals(exp1, carToStringArray(act1) );
		assertArrayEquals(exp2, carToStringArray(act2) );
		
	}

}