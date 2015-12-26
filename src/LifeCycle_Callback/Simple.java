package LifeCycle_Callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Simple  implements InitializingBean, DisposableBean
{
	String path;
	
	
	
	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public void draw()
	{
		System.out.println(getPath() + " Triangle Drawn");
	}



	@Override
	//this will be call before initialization of bean
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Initializing init method called");
	}



	@Override
	//this will be call when bean is about to destroy
	public void destroy() throws Exception 
	{
		System.out.println("DisposebleBean Destroy method called");
	}
	
	
	
	
	//another way(you can choose either one)
	//see the xml file
	public void  myInit()
	{
		System.out.println("My init method");
	}
	
	
	public void cleanUp()
	{
		System.out.println("My cleanUp method");
	}
	
	
}

