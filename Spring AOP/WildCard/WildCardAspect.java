package WildCard;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class WildCardAspect 
{
/*	 
		@Before("execution(public * get*() )")
		public void logginAdvice_3()
		{
			System.out.println("Advice run. 3");
		}
*/	
		
		
		
		//public * get*()  it should not take any parameter
		//public * get*(*) aslong as there is an argument
		//public * get*(..) can be 0 argument or can be 1 or more
		//you can use wild card when you specify package 
		//if you dont specify Access modifier(public private etc) then it will apply for any access modifier
}
