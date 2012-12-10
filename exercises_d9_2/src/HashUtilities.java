
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class HashUtilities {

	public static int shortHash(int value)
	{
		int mod = 999;
		do
		{
			if(value % mod == 0)
				return mod;
			--mod;
		}while(mod > 1);
		
		return 1;
	}
	
	@Test
	public void testHash()
	{
		int tests = 1000;
		while(tests-- > 0)
		{
			int randVal = Math.round(Math.round(Math.random() * 1024));
			//System.out.println("Checking: " + randVal);
			int result = HashUtilities.shortHash(randVal);
			assertTrue(result > 0 && result < 1000);
		}
	}	
}
