package Autowiring;

public class Triangle2 
{
	private Point2 point1;

	public Point2 getPoint1() {
		return point1;
	}

	public void setPoint1(Point2 point1) {
		this.point1 = point1;
	}
	
	public void draw()
	{
		System.out.println("point: (" + getPoint1().getX() + " , " + getPoint1().getY() +")");
	}
}
