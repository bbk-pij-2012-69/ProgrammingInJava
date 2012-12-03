
/**
 * 
 * A Book class is an object representing a book,
 * when constructed it should have the author and title set.
 * 
 * It will provide an interface to retrieve this information.
 * 
 * @author jsted02
 *
 */

public class Book {
	
	private final String title;
	private final String author;
	

	/**
	 * Constructor, requires title and author to be assigned.
	 * 
	 * @param title
	 * @param author
	 */
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	/**
	 * Returns title
	 * 
	 * @return String title
	 */
	public String getTitle()
	{
		return this.title;
	}
	
	/**
	 * Returns author
	 * 
	 * @return String author
	 */
	public String getAuthor()
	{
		return this.author;
	}
	
}
