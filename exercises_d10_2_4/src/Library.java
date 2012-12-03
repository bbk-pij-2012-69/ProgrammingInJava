/**
 * 
 * @author jsted02
 *
 * Library class, use to represent the library.
 * 
 * Has a name and a max number of books that can be 
 * borrowed by a user at a given time.
 * 
 * Provides a unique ID (for the library) to a user.
 * 
 */

public class Library implements BaseLibrary {
	private int idCounter = 0;
	private final String libraryName;
	public static final int DEFAULT_BOOKS = 3;
	private int maxNoBooks = DEFAULT_BOOKS;
	
	
	/**
	 * Constructor, requires a library name.
	 * 
	 * Library name is constant.
	 */
	public Library(String name)
	{
		this.libraryName = name;
	}
	
	/**
	 * Returns new unique id
	 * 
	 * @return int id
	 */
	@Override
	public int getId() {
		return ++this.idCounter;
	}

	/**
	 * Returns the libraries name
	 * 
	 * @return String libraryName
	 */
	@Override
	public String getLibrary() {
		return this.libraryName;
	}

	/**
	 * Sets the maximum no. of books the user is allowed to take out.
	 * 
	 * @param maxBooks
	 */
	@Override
	public void setMaxBooksPerUser(int maxBooks) {
		this.maxNoBooks = maxBooks;
	}

	/**
	 * Returns the maximum no. of books a user is allowed to take out.
	 * 
	 * return int maxNoBooks
	 */
	@Override
	public int getMaxBooksPerUser() {
		return this.maxNoBooks;
	}

}
