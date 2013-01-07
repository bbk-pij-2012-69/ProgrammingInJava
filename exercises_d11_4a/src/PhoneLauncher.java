
public class PhoneLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch(){
		SmartPhone smartPhone = new SmartPhone("Samsung");
		
		smartPhone.browseWeb("www.bbc.co.uk");
		smartPhone.findPosition();
		smartPhone.playGame("snake");
		smartPhone.printLastNumbers();
		smartPhone.ringAlarm("standard");
		smartPhone.call("0797 165 9351");
		smartPhone.call("0012 797 165 9351");
		
		System.out.println(smartPhone.getBrand());
	}

}
