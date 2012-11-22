
public class UserDB {
	private String[] users;
	private int[] ids;
	private int arraySize = 1;
	private int currentPos = 0;
			
	public UserDB()
	{
		this.users = new String[this.arraySize];
		this.ids = new int[this.arraySize];
	}
	
	private void increaseArraySize()
	{
		this.arraySize *= 2;

		String[] oldUsers = this.users;
		this.users = new String[this.arraySize];
		for(int i = 0; i < oldUsers.length; ++i)
			this.users[i] = oldUsers[i];
		
		int[] oldIds = this.ids;
		this.ids = new int[this.arraySize];
		for(int i = 0; i < oldIds.length; ++i)
			this.ids[i] = oldIds[i];
		
	}
	
	public void addUser(String user, int id)
	{
		if(this.currentPos + 1 >= this.arraySize)
			this.increaseArraySize();
		
		this.users[this.currentPos] = user;
		this.ids[this.currentPos] = id;
		
		++this.currentPos;
	}
	
	public String toString()
	{
		String rtnData = "";
		for(int i = 0; i <= this.currentPos; ++i)
			rtnData += this.usersToString(i) + "\n";

		return rtnData;
	}

	public String toString(char firstLetter)
	{
		String rtnData = "";
		for(int i = 0; i <= this.currentPos; ++i)
			if(this.users[i].charAt(0) == firstLetter)
				rtnData += this.usersToString(i) + "\n";

		return rtnData;
	}
	
	public String toString(int modDivisor)
	{
		String rtnData = "";
		for(int i = 0; i <= this.currentPos; ++i)
			if(this.ids[i]% modDivisor == 0)
				rtnData += this.usersToString(i) + "\n";

		return rtnData;
	}
	
	public String toString(int modDivisor, String firstLetter)
	{
		char letter = firstLetter.charAt(0);
		String rtnData = "";
		for(int i = 0; i <= this.currentPos; ++i)
			if(this.ids[i]% modDivisor == 0 || this.users[i].charAt(0) == letter)
				rtnData += this.usersToString(i) + "\n";
		
		return rtnData;
	}
	
	private String usersToString(int arrayLoc)
	{
		if(this.ids[arrayLoc] != 0 && this.users[arrayLoc] != null)
			return this.ids[arrayLoc] + "\t" + this.users[arrayLoc];
		return "";
	}

}
