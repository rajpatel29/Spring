package Autowiring;

public class Triangle 
{
	public Point pointA;
	public Point pointB;
	

	
	
	public Point getPointA() {
		return pointA;
	}




	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}




	public Point getPointB() {
		return pointB;
	}




	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}




	public void draw()
	{
		System.out.println("point: (" + getPointA().getX() + " , " + getPointA().getY() +")");
		System.out.println("point: (" + getPointB().getX() + " , " + getPointB().getY() +")");
	}
}
