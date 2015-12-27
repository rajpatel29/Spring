package Required_Annotation;

import org.springframework.beans.factory.annotation.Required;

public class Circle
{
	private Point centre;

	public Point getcentre() {
		return centre;
	}

	@Required
	public void setcentre(Point centre) {
		this.centre = centre;
	}
	
	public void draw()
	{
		System.out.println("centre: (" + getcentre().getX() + " , " + getcentre().getY() + ")");
	}
}
