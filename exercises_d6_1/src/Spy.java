
public class Spy {
	private static int spyCount = 0;
	private int spyId;
	
	public Spy(int id)
	{
		this.spyId = id;
		++Spy.spyCount;
		this.print();
	}
	
	private void print()
	{
		System.out.println("Spy " + this.spyId + " exists");
		this.printSpyCount();
	}

	public void die()
	{
		System.out.println("Spy " + this.spyId + " has been detected and eliminated");
		--Spy.spyCount;
		this.printSpyCount();
		
	}
	
	private void printSpyCount()
	{
		System.out.println(Spy.spyCount + " Spy's are alive!");
	}
	
}
