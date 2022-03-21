package edu.umb.cs680.HW05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscalatorTest {

	@Test
	public void checkingNonNullReturn() 
	{
		Escalator escalator = Escalator.getInstance();
		assertNotNull(escalator);
	}

	@Test
	public void checkingSameInstances()
	{
		Escalator escalator1 = Escalator.getInstance();
		Escalator escalator2 = Escalator.getInstance();
		assertSame(escalator1, escalator2);
	}
}
