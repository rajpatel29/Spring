package Coding_To_Interface;


public class Square implements Shape
{
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	
	public void draw()
	{
		System.out.println("drawing a square");
		System.out.println("PointA (" + getPointA().getX() + " , " +  getPointA().getY() + ")");
	
	}
	
}