package edu.umb.cs680.HW05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
class StandByTest
{
	private static Escalator escalator = Escalator.getInstance();
	
	@BeforeEach
	public void setUpBeforeEveryTest() throws Exception {
		escalator.changeState(StandBy.getInstance());
	}

	@Test
	public void getInstanceReturnNonNullValue() {
		assertNotNull(StandBy.getInstance());
	}

	@Test
	public void getInstanceReturnIdenticalInstance() {
		StandBy s1 = StandBy.getInstance();
		StandBy s2 = StandBy.getInstance();
		assertSame(s1, s2);
	}

	@Test
	public void startButtonPushedTesting() 
	{
		assertSame(escalator.getCurrentState(), StandBy.getInstance());
	}

	@Test
	public void stopButtonPushedTesting() 
	{
		assertSame(escalator.getCurrentState(), StandBy.getInstance());
	}

	@Test
	public void motionDetectedTesting() 
	{
		assertSame(escalator.getCurrentState(), StandBy.getInstance());
	}

	@Test
	public void motionNotDetectedTesting() 
	{
		assertSame(escalator.getCurrentState(), StandBy.getInstance());
	}
}
