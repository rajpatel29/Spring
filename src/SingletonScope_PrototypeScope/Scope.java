package SingletonScope_PrototypeScope;

public class Scope 
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
}

