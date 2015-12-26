import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import Autowiring.Triangle;
import Autowiring.Triangle2;
import Collection.CollectionClass;
import ConstructorInjection.ConstructorInjection;
import InjectinObject_InnerBeans.Square;
import SimpleSpringExample.Simple;
import SingletonScope_PrototypeScope.Scope;

@SuppressWarnings("deprecation")
public class MainClass 
{
	public static void main(String[] args) 
	{
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		//when application ends, context knows  its time to close and destroy all the beans
		//when application ends registerShutdownHook method is called
		context.registerShutdownHook();
/*		
		Simple obj1 = (Simple) context.getBean("simple");
		obj1.draw();
     
     	System.out.println("======================");
		
		ConstructorInjection obj =  (ConstructorInjection) context.getBean("constructorInjection");
		obj.callMe();
		
		System.out.println("======================");
		
		Square obj2 =  (Square) context.getBean("square");
//		Square obj2 =  (Square) context.getBean("square-alias");  //you can use this as well.
		obj2.showDetails();
		
		
		System.out.println("======================");
		CollectionClass obj3 =  (CollectionClass) context.getBean("collection");
		obj3.draw();

		System.out.println("======================");
		
		Triangle obj4 = (Triangle) context.getBean("autoWrite");
		obj4.draw();
				
		Triangle2 obj5 = (Triangle2) context.getBean("autoWrite2");
		obj5.draw();
		
		System.out.println("======================");
		
		
		Scope obj6 = (Scope) context.getBean("scope");
		obj6.draw();
		obj6.setPath("updated path");
		
		
		Scope obj7 = (Scope) context.getBean("scope");
		obj7.draw();
		
		System.out.println("======================");

		
		Application_Context_Aware.Square obj8 =  (Application_Context_Aware.Square) context.getBean("applicationcontextaware");
		obj8.showDetails();
		System.out.println("======================");
	
		
		BeanDefinationInheritace.Square obj9 = (BeanDefinationInheritace.Square) context.getBean("beandefinationinheritace_1");
		obj9.showDetails();
	
		System.out.println("======================");

		BeanDefinationInheritace.SquareList obj9 = (BeanDefinationInheritace.SquareList) context.getBean("beandefinationinheritace_3");
		obj9.draw();
	
		System.out.println("======================");

		
		//uncomment 11th in spring.xml file
		
		LifeCycle_Callback.Simple obj10 = (LifeCycle_Callback.Simple) context.getBean("lifecycle");
		obj10.draw();
     
     	System.out.println("======================");

		
		BeanFactoryPostProcessor.Square obj11 =  (BeanFactoryPostProcessor.Square) context.getBean("someName");
		obj11.showDetails();
		
		System.out.println("======================");	
 */
		
		System.out.println("======================");	
		
		//advantage of using Interface is if you want to add rectangle then it is easy to make change
		//just implement Shape interface
		//add bean in spring.xml
		//then get appropriate bean
		
		Coding_To_Interface.Shape  obj12 =  (Coding_To_Interface.Square) context.getBean("codingToInterface_square");
		obj12.draw();
		
		
		Coding_To_Interface.Shape  obj13 =  (Coding_To_Interface.Triangle) context.getBean("codingToInterface_triangle");
		obj13.draw();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
