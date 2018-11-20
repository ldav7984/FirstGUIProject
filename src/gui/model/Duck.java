package gui.model;

public class Duck 
{
	private String sound;

	public Duck()
	{
		this.sound = "Quack quack";
	}
	
	
	public String getSound()
	{
		return sound;
	}
	public void setSound(String sound)
	{
		this.sound = sound;
	}
	
	public String toString()
	{
		
		String description = "I'm a little duck, quack quack quack, feathers on my tummy, and feathers on my back.";
		return description;
	}
}
