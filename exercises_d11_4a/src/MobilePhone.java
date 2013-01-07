
public class MobilePhone extends OldPhone {
	private String[] recentCalls = new String[10];
	
	public MobilePhone(String brand)
	{
		super(brand);
	}
	
	void ringAlarm(String noise)
	{
		System.out.println("Alarm " + noise + " ringing...");
	}

	private void playGame(String game)
	{
		System.out.println("Playing " + game + "...");
	}
	
	void printLastNumbers()
	{
		for(int i = 0; i < recentCalls.length; ++i)
		{
			System.out.print("Call " + (i + 1) + ": ");
			if(recentCalls[i] == null)
				System.out.println("No call");
			else
				System.out.println(recentCalls[i]);
				
		}
	}
	
	

}
