package JoinPoints;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import Model.Circle;

@Aspect
public class JoinPointAspect 
{
	
/*
	@Before("allCircleMethod()")
	public void logginAdvice(JoinPoint jointPoint)
	{
		System.out.println("Advice run :)");
		
		//get the name of the method for which this aspect method run
		System.out.println(jointPoint.toString());
		
		//get the object whose method was called
		Circle circle = (Circle) jointPoint.getTarget();
		
		System.out.println("In logginAdvice method : " + circle.getName()); 
		
	}
	
	@Pointcut("within(Model.Circle)")
	public void allCircleMethod()
	{}
*/
	
}
