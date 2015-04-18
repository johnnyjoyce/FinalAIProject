package gmit;

public abstract class AbstractGameCharacter {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int attack()
	{
		return 0;
	}

}
