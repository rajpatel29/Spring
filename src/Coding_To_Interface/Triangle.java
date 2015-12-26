package Coding_To_Interface;

public class Triangle implements Shape
{
	private Point pointB;
	private Point pointC;
	
	public Point getPointC() 
	{
		return pointC;
	}
	public void setPointC(Point pointC) 
	{
		this.pointC = pointC;
	}
	public Point getPointB()
	{
		return pointB;
	}
	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	}

	
	public void draw()
	{
		System.out.println("drawing a triangle");
		System.out.println("PointB (" + getPointB().getX() + " , " +  getPointB().getY() + ")");
		System.out.println("PointC (" + getPointC().getX() + " , " +  getPointC().getY() + ")");
	
	}
}
