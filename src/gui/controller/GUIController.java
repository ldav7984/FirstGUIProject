package gui.controller;

import gui.view.FirstFrame;
import gui.view.FirstPanel;

public class GUIController 
{
	private FirstFrame appFrame;
	
	public GUIController() //constructor
	{
		appFrame = new FirstFrame(this);
		//view gets initialized after the model
	}
	
	public void start()
	{
		
		
	}
	
}
