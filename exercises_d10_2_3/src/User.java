/**
 *  
 * @author jsted02
 *
 * Library User class, stores the user id and name of
 * the Library user.
 *
 * Name is set at construction, id set post construction
 *
 */
public class User {
	private final String name;
	private int id;

	/**
	 * Creates user, users name is required
	 * 
	 * @param String name
	 */
	public User(String name)
	{
		this.name = name;
	}

	/**
	 * Returns the Users name
	 * 
	 * @return String name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Returns the Users ID
	 * 
	 * @return int id
	 */
	public int getId()
	{
		return this.id;
	}
	
	/**
	 * Sets the Users ID	
	 * 
	 * @param int id
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
	 * REgisters user with a library, also sets the ID
	 * 
	 * @param Library lib
	 */
	public void register(Library lib)
	{
		this.setId(lib.getId());
	}
	
}
