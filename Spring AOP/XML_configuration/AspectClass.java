package XML_configuration;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class AspectClass 
{

	
	
	//target method returns an object that's why
	public Object myAroundAdvice(ProceedingJoinPoint  proceedingJointPoint)
	{
		Object returnValue = null;
		
		try 
		{
			System.out.println("cccc Before advice");
			
			//if you want to execute target advice
			//this executes the method that this advice method advices
			//you can if you want skip using if condition
			returnValue = proceedingJointPoint.proceed();

			System.out.println("After reeturning");
		
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		
		
		System.out.println("After finally");
		
		return returnValue;
	}
}
