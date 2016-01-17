import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.JdbcDaoImpl;
import Model.Apple;

public class JDBCDemoMainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl" , JdbcDaoImpl.class);
		
//		Apple apple = dao.getApple(5);
//		System.out.println("Its working  :  " + apple.getName());

		int count = dao.getAppleCount();
		System.out.println("" +  count);
		
	}
}
