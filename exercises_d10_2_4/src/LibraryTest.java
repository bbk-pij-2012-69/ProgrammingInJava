import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LibraryTest {

	// Testing interface
	@Test
	public void testConstructor()
	{
		String libraryName = "Test Library";
		Library lib = new Library(libraryName);
		assertSame("Constructor is incorrect", libraryName, lib.getLibrary());
	}
	
	@Test
	public void testGetId()
	{
		int testCounter = 0;
		String libraryName = "Test Library";
		Library lib = new Library(libraryName);
		int[] ids = new int[1000];
	
		do{
			int instanceCount = 0;
			int newId = lib.getId();
			ids[testCounter++] = newId;

			for(int x = 0; x < testCounter; ++x)
				if(ids[x] == newId)
					++instanceCount;

			assertTrue(instanceCount + " instances of id " + newId + " found", instanceCount == 1);
			
			
		}while(testCounter < 1000);
	}
	
	@Test
	public void testGetLibrary()
	{
		String libraryName = "Test Library";
		Library lib = new Library(libraryName);
		assertSame("Library name is incorrect", libraryName, lib.getLibrary());
	}
	
	@Test
	public void testGetMaxBooksPerUser()
	{
		String libraryName = "Test Library";
		Library lib = new Library(libraryName);
		assertSame("Max No. Books is incorrect", Library.DEFAULT_BOOKS, lib.getMaxBooksPerUser());
	}
	
	@Test
	public void testSetMaxBooksPerUser()
	{
		int newMax = 52;
		String libraryName = "Test Library";
		Library lib = new Library(libraryName);
		lib.setMaxBooksPerUser(newMax);
		assertSame("Max No. Books is incorrect", newMax, lib.getMaxBooksPerUser());
	}

}
