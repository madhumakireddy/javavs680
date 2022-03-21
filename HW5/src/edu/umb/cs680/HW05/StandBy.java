package edu.umb.cs680.HW05;

public class StandBy implements State 
{
	private Escalator escalator = Escalator.getInstance();
	private StandBy() 
	{
	}

	private static StandBy instance = null;

	public static StandBy getInstance() {
		if (instance == null)
			instance = new StandBy();
		return instance;
	}
	
	public void startButtonPushed()
	{
		System.out.println("StandBy ---- start button");
		escalator.moveSteps();
		escalator.changeState(Operating.getInstance());
	}

	public void stopButtonPushed() 
	{
		System.out.println("StandBy ---- stop button");
		escalator.disableSensor();
		escalator.changeState(Stopped.getInstance());
	}

	public void motionDetected()
	{
		System.out.println("StandBy ---- Motion Detected");
		escalator.moveSteps();
		escalator.changeState(Operating.getInstance());
	}
	
	public void motionNotDetected()
	{
		System.out.println("StandBy ---- Motion Not Detected");
		System.out.println("----StandBy----");
	}
	
	public static void main(String[] args) {
		System.out.println("The StandBy Class completed sucessfully");
	}
}