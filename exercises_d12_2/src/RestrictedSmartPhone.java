
public class RestrictedSmartPhone extends SmartPhone{

	public RestrictedSmartPhone(String brand)
	{
		super(brand);
	}

	@Override
	void playGame(String game)
	{
		System.out.println("Not allowed to play games!");
	}
	
}
