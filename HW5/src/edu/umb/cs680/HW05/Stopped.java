package edu.umb.cs680.HW05;

public class Stopped implements State 
{
	private static Escalator escalator;
	private Stopped() 
	{
	}

	private static Stopped instance = null;

	public static Stopped getInstance() {
		if (instance == null)
			instance = new Stopped();
		return instance;
	}
	
	public static void setEscalator(Escalator escalator) 
	{
		Stopped.escalator = escalator;
	}
	public void startButtonPushed()
	{
		System.out.println("Stopped ---- start button");
		escalator.changeState(StandBy.getInstance());
		
	}

	public void stopButtonPushed() 
	{
		System.out.println("Stopped ---- stop button");
	}

	public void motionDetected()
	{
		System.out.println("Stopped ---- Motion Detected");
	}
	
	public void motionNotDetected()
	{	
		System.out.println("Stopped ---- Motion Not Detected");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The Stopped Class completed sucessfully");
	}
}