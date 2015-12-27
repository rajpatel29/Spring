package Component_Stereotype_Annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//you can specify the role of a bean by choosing any of the below annotation


@Component
//@Service
//@Repository
//@Controller

public class Circle_22
{
	private Point centre_1;

	public Point getcentre() {
		return centre_1;
	}


	//if we do not specify name then it will look for bean which has centre_1 id
	@Resource(name="x9")
	public void setcentre(Point centre) {
		this.centre_1 = centre;
	}
	
	public void draw()
	{
		System.out.println("centre: (" + getcentre().getX() + " , " + getcentre().getY() + ")");
	}
	
}
