package gmit;

public class Exit {
	
	private Location loc;
	private Directions direction;
	
	public Exit(Location loc, Directions direction) 
	{
		super();
		this.loc = loc;
		this.direction = direction;
	}
	
	public Location getLoc() 
	{
		return loc;
	}
	
	public void setLoc(Location loc) 
	{
		this.loc = loc;
	}
	
	public Directions getDirection() 
	{
		return direction;
	}
	
	public void setDirection(Directions direction) 
	{
		this.direction = direction;
	}
}
