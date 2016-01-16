package PointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAspect 
{
/*	
		//If you need to run same aspect twice then
		@Before("allGetters()")
		public void logginAdvice_4()
		{
			System.out.println("Advice run. 4");
		}

		
		
		//this will execute only when these 2 point cut apply
		@Before("allGetters() && allCircleMethod()")
		public void logginAdvice_5()
		{
			System.out.println("Advice run. 5");
		}
		
		@Pointcut("execution( * get*() )")
		public void allGetters() {}

		
		//for all the method within Circle class
		@Pointcut("within(Model.Circle)")
		public void allCircleMethod()
		{}
		
		
		//It looks for method arguments
		//@Pointcut(args ())

 */
}
