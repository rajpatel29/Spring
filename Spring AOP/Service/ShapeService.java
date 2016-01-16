package Service;

import Custom_Advice_Annotations.Loggable;
import Model.Circle;
import Model.Triangle;

public class ShapeService
{
	private Triangle triangle;
	private Circle circle;
	
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	@Loggable
	public Circle getCircle()
	{
		System.out.println("ShapeService class getCircle method :)");
		
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
