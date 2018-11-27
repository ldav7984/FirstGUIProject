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
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
