package gmit;

public interface Character extends Runnable {

	public abstract String getCharacterName();
	
	public abstract void setCharacterName(String name);

	public void Look();
	public void go();
	public void get();
	public void move();
	public void defend();
	public void use();
	public void take();
	public void exit();
}
