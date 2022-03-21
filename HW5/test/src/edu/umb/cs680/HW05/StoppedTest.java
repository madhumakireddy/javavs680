package edu.umb.cs680.HW05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class StoppedTest 
{

	private static Escalator escalator = Escalator.getInstance();;


	@BeforeEach
	public void setUpBeforeEveryTest() throws Exception {
		escalator.changeState(Stopped.getInstance());
	}

	@Test
	public void getInstanceReturnNonNullValue() {
		assertNotNull(Stopped.getInstance());
	}

	@Test
	public void getInstanceReturnIdenticalInstance() {
		Stopped s1 = Stopped.getInstance();
		Stopped s2 = Stopped.getInstance();
		assertSame(s1, s2);
	}

	@Test
	public void startButtonPushedTesting() {
		assertSame(escalator.getCurrentState(), Stopped.getInstance());
	}

	@Test
	public void stopButtonPushedTesting() {
		assertSame(escalator.getCurrentState(), Stopped.getInstance());
	}

	@Test
	public void motionDetectedTesting() {
		assertSame(escalator.getCurrentState(), Stopped.getInstance());
	}

	@Test
	public void motionNotDetectedTesting() {
		assertSame(escalator.getCurrentState(), Stopped.getInstance());
	}
}