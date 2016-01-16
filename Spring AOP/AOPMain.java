import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Model.*;
import Service.ShapeService;

public class AOPMain 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		
		//so here we do not have to cast it to ShapeService.
		ShapeService obj = context.getBean("shapeService" , ShapeService.class);
		
		System.out.println(obj.getCircle().getName());
		
		System.out.println("===============================");

		obj.getCircle().setName("xyz");
	
	
		//Around advice
		obj.getCircle();
		
		
		
		obj.getCircle().setAndReturnName("dummy string");
		
		
		System.out.println("===============================");
		
		//System.out.println(obj.getTriangle().getName());
	}
}
