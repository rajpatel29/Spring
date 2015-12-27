package JavaSpecificationRequest_250_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle
{
	private Point centre_1;

	public Point getcentre() {
		return centre_1;
	}


	//if we do not specify name then it will look for bean which has centre_1 id
	@Resource(name="x8")
	public void setcentre(Point centre) {
		this.centre_1 = centre;
	}
	
	public void draw()
	{
		System.out.println("centre: (" + getcentre().getX() + " , " + getcentre().getY() + ")");
	}
	
	
	//this will be call after bean is initialize
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Initialize Circle");
	}
	
	//this will be call before destroying the bean
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy Circle");
	}
	
}
