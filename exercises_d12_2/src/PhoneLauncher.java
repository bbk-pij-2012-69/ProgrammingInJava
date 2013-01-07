
public class PhoneLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch(){
		//SmartPhone smartPhone = new SmartPhone("Samsung");
		SmartPhone smartPhone = new SmartPhone("Samsung");
		testPhone(smartPhone);

		MobilePhone mobilePhone = new MobilePhone("Nokia");
		testPhone(mobilePhone);
		
		//smartPhone.browseWeb("www.bbc.co.uk");
		//smartPhone.findPosition();
		

	}

	
	public static void testPhone(Phone phone)
	{
		SmartPhone testPhone = (SmartPhone)phone;
		
		testPhone.playGame("snake");
		testPhone.printLastNumbers();
		testPhone.ringAlarm("standard");
		testPhone.call("0797 165 9351");
		testPhone.call("0012 797 165 9351");
		System.out.println(testPhone.getBrand());
	}
}
