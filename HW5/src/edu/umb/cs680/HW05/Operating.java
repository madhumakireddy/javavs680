package edu.umb.cs680.HW05;

public class Operating implements State
{
	private static Escalator escalator;
	private Operating()
	{
	}
	
	private static Operating instance = null;

	public static Operating getInstance() {
		if (instance == null)
		{
			instance = new Operating();
		}
		return instance;
	}
	
	public static void setEscalator(Escalator escalator) 
	{
		Operating.escalator = escalator;
	}
	
	public void startButtonPushed()
	{
		System.out.println("Operating ---- start button");
		escalator.moveSteps();
	}

	public void stopButtonPushed() 
	{
		System.out.println("Operating ---- stop button");
		escalator.stopSteps();
		escalator.disableSensor();
		escalator.changeState(Stopped.getInstance());
	}

	public void motionDetected()
	{
		System.out.println("Operating ---- Motion Detected");
		escalator.moveSteps();
	}
	
	public void motionNotDetected()
	{
		System.out.println("Operating ---- Motion Not Detected");
		escalator.stopSteps();
		escalator.changeState(StandBy.getInstance());
	}
	
	public static void main(String[] args)
	{
		System.out.println("The Operating Class completed sucessfully");
	}
}