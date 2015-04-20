package gmit;

public interface Character extends Runnable {

	public abstract String getCharacterName();
	
	public abstract void setCharacterName(String name);

	public void Look();
	public void Go();
	public void Get();
	public void Move();
	public void Defend();
	public void Use();
	public void Take();
	public void Exit();
}
