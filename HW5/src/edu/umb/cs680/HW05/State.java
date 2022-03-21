package edu.umb.cs680.HW05;

public interface State 
{
	Escalator escalator = Escalator.getInstance();
	void startButtonPushed();
	void stopButtonPushed();
	void motionDetected();
	void motionNotDetected();
	public static void main(String[] args)
	{
		System.out.println("The State Interface completed sucessfully");
	}
}