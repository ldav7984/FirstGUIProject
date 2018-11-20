package gui.view;
import javax.swing.JFrame;

public class FirstFrame extends JFrame //it is a customized JFrame
{

	public FirstFrame() //constructor
	{
		super(); //the class inherits from another class so it MUST start with super();
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setSize(800, 900);
		this.setTitle("My first GUI");;
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
