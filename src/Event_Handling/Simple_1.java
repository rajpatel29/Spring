package Event_Handling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Simple_1 implements ApplicationEventPublisherAware 
{
	private ApplicationEventPublisher publisher;
	
	public void draw()
	{
		System.out.println("In draw method");
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) 
	{
		this.publisher = publisher;
	}
}
