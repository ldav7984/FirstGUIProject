package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame //it is a customized JFrame
{
	private GUIController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController appController) //constructor
	{
		super(); //the class inherits from another class so it MUST start with super();
		
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setContentPane(appPanel); 
		//takes a JPanel and installs it as a usable, visible component of the frame window
		
		this.setContentPane(appPanel);
		this.setTitle("My first GUI");
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
