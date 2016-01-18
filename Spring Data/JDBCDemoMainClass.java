import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.JdbcDaoImpl;
import Dao.JdbcTemplateDaoImpl;
import Model.Apple;

public class JDBCDemoMainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl" , JdbcDaoImpl.class);
		
//		Apple apple = dao.getApple(5);
//		System.out.println("Its working  :  " + apple.getName());

//		int count = dao.getAppleCount();
//		System.out.println("Number of apple in database : " +  count);
		
//		String name = dao.getAppleName(1);
//		System.out.println("Name of Apple 1: " + name);
		
//		Apple apple = dao.getAppleObject(2);
//		System.out.println("Name of Appple 2: " + apple.getName());
		
//		List<Apple> appleList = dao.getListOfApple();
//		System.out.println("size of the list : " + appleList.size());
		
//		Apple appleObj = new Apple(4, "Forth");
//		dao.insertRow(appleObj);
		
//		dao.createTable();
		
//		Apple appleObj = new Apple(6, "Sixth");
//		dao.insertRowUsingNamedParameter(appleObj);	
		
		
		
		//Better way to do the same as above

		JdbcTemplateDaoImpl jdbcTemplateDaoImpl = context.getBean("jdbcTemplateDaoImpl" , JdbcTemplateDaoImpl.class);
		System.out.println("Number of apple in database : " + jdbcTemplateDaoImpl.getAppleCount() );
		System.out.println("Done");
		
		
		
		
	}
}
