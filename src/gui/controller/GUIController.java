package gui.controller;

import gui.model.Duck;
import gui.view.FirstFrame;

public class GUIController 
{

	private Duck myDuck;
	private FirstFrame appFrame;
	
	public GUIController() //constructor
	{
		myDuck = new Duck();
		
		appFrame = new FirstFrame();
		//view gets initialized after the model

	}
	
	public void start()
	{
		
	}
	
}
