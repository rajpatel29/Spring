package Bean_Post_Procesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor
{

	//both method need to return beanObject
	
	
	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException 
	{
		System.out.println("In After Initialization method. Bean Name is " + beanName);
		return beanObject;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException 
	{
		System.out.println("In Before Initialization method. Bean Name is " + beanName);
		
		if(beanName.equals("lifecycle"))
		{
			System.out.println("yes");
		}
		
		
		return beanObject;
	}

}
