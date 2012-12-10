
public class SmartPhone extends MobilePhone{

	void browseWeb(String url)
	{
		System.out.println("Browsing " + url + "...");
	}
	
	GPSPosition findPosition()
	{
		return new GPSPosition(5,10);
	}
}
