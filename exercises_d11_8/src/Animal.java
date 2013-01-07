
public abstract class Animal {

	abstract public void call();
	
	public void reproduce()
	{
		this.implReproduce();
	}
	
	abstract protected void implReproduce();
	
}
