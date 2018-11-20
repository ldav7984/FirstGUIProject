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
		//takes a JPanel and installs it as a usable, visible component of the window
		
		this.setSize(800, 900);
		this.setTitle("My first GUI");;
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
