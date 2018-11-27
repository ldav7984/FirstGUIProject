package gui.view;

import javax.swing.*;
import gui.controller.GUIController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;


public class FirstPanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	public FirstPanel(GUIController appController) //constructor
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("Colors wow");
		this.colorButton = new JButton("Clickety");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() //installs pieces
	{
		this.setBackground(Color.blue);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
				//System.out.println("This happens when the button is clicked."); 
				//quick tester for action listener
			}
		} ); //creating a parameter of a new instance of a new class with a method in it 
			//this single line of code ends at the );
	}
	
	private void changeBackgroundColor()
	{
	int red = (int) (Math.random() * 256); //(int) casts the double to an int. All decimal values are thrown away	
	int green = (int) (Math.random() * 256);
	int blue = (int) (Math.random() * 256);
	
	this.setBackground(new Color(red, green, blue));
	textLabel.setText("Red: " + red + ". Green: " + green + ". Blue: " + blue + ".");
	}
	
}
