package Get_Text_From_Propery_File;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle_45 
{
	private Point centre;
	
	public Point getCentre() {
		return centre;
	}

	@Resource(name="x10")
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void draw()
	{
		System.out.println("From Circle_45 Class " + this.messageSource.getMessage("greeting", null, "default Message" , null));
		System.out.println("From Circle_45 Class " + this.messageSource.getMessage("drawing.point", new Object[] {centre.getX() , centre.getY()}, "default Message" , null));
		
	
	}
}
