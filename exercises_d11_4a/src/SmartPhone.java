
public class SmartPhone extends MobilePhone{

	public SmartPhone(String brand)
	{
		super(brand);
	}
	
	@Override
	public void call(String number)
	{
		if(number.startsWith("00"))
			System.out.println("Calling " + number + " through the internet to save money");
		else
			super.call(number);
	}
	
	public void playGame(String game)
	{
		System.out.println("Playing " + game + "...");
	}
	
	public void browseWeb(String url)
	{
		System.out.println("Browsing " + url + "...");
	}
	
	public GPSPosition findPosition()
	{
		return new GPSPosition(5,10);
	}
}
