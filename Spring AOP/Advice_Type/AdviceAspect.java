package Advice_Type;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AdviceAspect 
{

/*	
	@Before("args(String)")
	public void stringArgumentMethod()
	{
		System.out.println("A method that take a String as argument");
	}
*/	

	
	
	
	
	
	
/*		
	//If you want to know the value of that parameter
	//try @Before @After see the difference
	//if while executing setter we get exception then this will not execute 
	
	@AfterReturning("args(name)")
	public void stringArgumentMethod(String name)
	{
		System.out.println("A method that takea String as argument. which is " + name );
	}
	
	
	//this will be call if method generates exception
	//to get the object of exception
	
	@AfterThrowing(pointcut = "args(String)" , throwing = "ex")
	public void exceptionAdvice(RuntimeException ex)
	{
		System.out.println("Exeption Advice called");
		System.out.println("An exception has been thrown : " + ex);
	}
*/
	
	
	
	
	
	
	
	
	
	
/*	

	//if tou want returning object of the method then
	
	@AfterReturning(pointcut = "args(name)" , returning = "returnString")
	
	//Object class catches all the return type that is why 
	public void stringArgumentMethod(String name , Object returnString)
	{
		System.out.println("output of the setAndReturnName method is " + returnString );
	}
*/	
	
	
	
	
	
	
	
/*	
	
	//If you want to execute some statements after and before a method then
	
	//It has to have one argument of type
	//you can have more arguments based on your requirements.
	//lets say you want to execute below method for those method which takes one argument
	//you will have to use proceedingJointPoint.proceed();
	
	//In AfterReturning we can get Object as a output of a target method but we can not modify it
	//But in Around we can modify the object if we want to
	
	
	//custome advice annotation
	@Around("@annotation(Custom_Advice_Annotations.Loggable)")
	
	//target method returns an object that's why
	public Object myAroundAdvice(ProceedingJoinPoint  proceedingJointPoint)
	{
		Object returnValue = null;
		
		try 
		{
			System.out.println("Before advice");
			
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

*/	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
