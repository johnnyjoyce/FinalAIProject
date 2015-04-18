package gmit;

public class Item {
	
	public String name;
	public int value;
	public Location it;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getValue() 
	{
		return value;
	}
	
	public void setValue(int value) 
	{
		this.value = value;
	}
	
	public Location getIt() 
	{
		return it;
	}
	
	public void setIt(Location it) {
		this.it = it;
	}
}
