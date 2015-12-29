package Event_Handling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//declare it as Spring bean
@Component
public class MyEventListener implements ApplicationListener
{
	//this will be call whenever any event publish
	@Override
	public void onApplicationEvent(ApplicationEvent event) 
	{
		System.out.println(event.toString());
	}

}
