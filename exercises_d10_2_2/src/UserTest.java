import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * 
 * @author jsted02
 *
 * User test class.
 *
 */
public class UserTest {
	
	@Test
	public void testConstruction()
	{
		String name = "jsted02";
		User user = new User(name);
		assertSame("Testing construction", name, user.getName());
	}

	@Test
	public void testGetName()
	{
		String name = "jsted02";
		User user = new User(name);
		assertSame("Testing construction", name, user.getName());
	}
	
	@Test
	public void testGetId()
	{
		String name = "jsted02";
		int id = 123;
		User user = new User(name);
		
		user.setId(id);
		assertSame("Testing construction", id, user.getId());
	}
	
	
}
