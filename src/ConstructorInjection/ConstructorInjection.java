package ConstructorInjection;

public class ConstructorInjection 
{
	private String type;
	private int height;
	
	public ConstructorInjection(String type) 
	{
		this.type = type;
	}
	
	public ConstructorInjection(int height) 
	{
		this.height = height;
	}
	
	public ConstructorInjection(String type, int height) 
	{
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}


	public int getHeight() {
		return height;
	}
	
	public void callMe()
	{
		System.out.println("TYPE: " + getType() + " HEIGHT: " +getHeight());
	}
}
