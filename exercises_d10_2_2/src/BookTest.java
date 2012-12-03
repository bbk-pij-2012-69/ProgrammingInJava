import static org.junit.Assert.assertSame;

import org.junit.Test;


public class BookTest {

	// Testing interface
	@Test
	public void testInterface()
	{
		String inTitle = "Test Title";
		String inAuthor = "Test Author";
		Book book1 = new Book(inTitle, inAuthor);
		String title = book1.getTitle();
		String author = book1.getAuthor();
		
		
		assertSame("Title is incorrect", title, inTitle);
		assertSame("Title is incorrect", author, inAuthor);
		
		assertSame("Title is incorrect", title, inTitle);
		assertSame("Title is incorrect", author, inAuthor);
	}
}
