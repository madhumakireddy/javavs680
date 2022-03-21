package edu.umb.cs680.HW05;

public class Escalator 
{
	private static Escalator instance = null;
	private static State state = Operating.getInstance();

	private Escalator() 
	{
	}

	static Escalator getInstance() 
	{
		if (instance == null)
		{
			instance = new Escalator();
			Operating.setEscalator(instance);
		}
		return instance;
	}

	public State getCurrentState() 
	{
		return state;
	}
	
	public void changeState(State s)
	{
		state = s;
	}

	public void startButtonPushed()
	{
		state.startButtonPushed();
	}

	public void stopButtonPushed()
	{
		state.stopButtonPushed();
	}

	public void motionDetected()
	{
		state.motionDetected();
	}
	
	public void motionNotDetected()
	{
		state.motionNotDetected();
	}

	public void moveSteps()
	{
		System.out.println("Escalator is Opearating...!");
	}

	public void stopSteps() 
	{
		System.out.println("Escalator is Stopped...!");
	}

	public void enableSensor()
	{
		System.out.println("Enabling Sensor...!");
	}

	public void disableSensor()
	{
		System.out.println("Disabling Sensor...!");
	}
	public static void main(String args[]) 
	{
		Escalator escalator = Escalator.getInstance();
		escalator.startButtonPushed();
		escalator.stopButtonPushed();
		escalator.motionDetected();
		escalator.motionNotDetected();
	}
}