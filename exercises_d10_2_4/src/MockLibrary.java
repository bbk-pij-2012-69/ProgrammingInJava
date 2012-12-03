/**
 * @author jsted02
 *
 * Mock Library class for testing
 */
public class MockLibrary implements BaseLibrary {
	
	public int getId()
	{
		return 13;
	}
	
	public String getLibrary()
	{
		return "Library name";
	}
	
	public int getMaxBooksPerUser()
	{
		return 3;
	}
	
	public void setMaxBooksPerUser(int newMax)
	{

	}

}
