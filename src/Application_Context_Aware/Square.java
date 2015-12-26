package Application_Context_Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware ,  BeanNameAware
{
	private Point pointA;
	private Point pointB;
	private ApplicationContext context;
	
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
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException 
	{
		context = this.context;
	}
	@Override
	public void setBeanName(String beanname) 
	{
		System.out.println(beanname);
	}

	
}
