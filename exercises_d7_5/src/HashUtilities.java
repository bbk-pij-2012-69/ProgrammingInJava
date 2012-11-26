
public class HashUtilities {

	public static int shortHash(int value)
	{
		int mod = 999;
		do
		{
			//System.out.println(mod + " " + value % mod);
			if(value % mod == 0)
				return mod;
			--mod;
		}while(mod > 1);
		
		return 1;
	}
	
}
