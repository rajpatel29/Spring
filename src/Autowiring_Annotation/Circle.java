package Autowiring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle
{
	private Point centre_1;

	public Point getcentre() {
		return centre_1;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setcentre(Point centre) {
		this.centre_1 = centre;
	}
	
	public void draw()
	{
		System.out.println("centre: (" + getcentre().getX() + " , " + getcentre().getY() + ")");
	}
}
