package BeanFactoryPostProcessor;


public class Square 
{
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	
	public void showDetails()
	{
		System.out.println("PointA (" + getPointA().getX() + " , " +  getPointA().getY() + ")");
	
	}
	
}

