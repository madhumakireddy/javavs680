package edu.umb.cs680.HW05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class OperatingTest 
{
	private static Escalator escalator = Escalator.getInstance();
	
	@BeforeEach
	public void setUpBeforeEveryTest() throws Exception {
		escalator.changeState(Operating.getInstance());
	}
	@Test
	public void checkingNonNullReturn() {
		assertNotNull(Operating.getInstance());
	}

	@Test
	public void checkingSameInstances() {
		Operating o1 = Operating.getInstance();
		Operating o2 = Operating.getInstance();
		assertSame(o1, o2);
	}

	@Test
	public void startButtonPushedTesting() 
	{
		assertSame(escalator.getCurrentState(), Operating.getInstance());
	}

	@Test
	public void stopButtonPushedTesting() 
	{
		assertSame(escalator.getCurrentState(), Operating.getInstance());
	}

	@Test
	public void motionDetectedTesting() 
	{
		assertSame(escalator.getCurrentState(), Operating.getInstance());
	}

	@Test
	public void motionNotDetectedTesting() 
	{
		assertSame(escalator.getCurrentState(), Operating.getInstance());
	}

}
