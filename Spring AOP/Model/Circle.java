package Model;

public class Circle
{
	private String name;

	public String getName() 
	{
		
		return name;
	}

	//this will be call at the time of initialization
	//thats why you will see this method executing 2 times(we are calling it from main class also)
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("Circle setter method called");
		
		//comment property tag of Circle class in Sring.xml
//			throw( new RuntimeException() );
		
	}
	
	
	
	
	public String setAndReturnName(String name) 
	{
		this.name = name;
		System.out.println("Circle setAndReturnName method called");
		return name;
	}
}
