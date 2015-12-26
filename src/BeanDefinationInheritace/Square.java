package BeanDefinationInheritace;


public class Square 
{
	private Point pointA;
	private Point pointB;
	
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
	
	
	public void showDetails()
	{
		System.out.println("PointA (" + getPointA().getX() + " , " +  getPointA().getY() + ")");
		System.out.println("PointB (" + getPointB().getX() + " , " +  getPointB().getY() + ")");
	}
	
}
