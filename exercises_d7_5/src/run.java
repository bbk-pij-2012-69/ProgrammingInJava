import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class run {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println(HashUtilities.shortHash(12134));
		System.out.println(HashUtilities.shortHash(1000));
		System.out.println(HashUtilities.shortHash(684654));
		System.out.println(HashUtilities.shortHash(7861));
		System.out.println(HashUtilities.shortHash(478));
		
		String str = getString();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		
	
	}
	
	public static String getString() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give me a string and I will calculate its hash code");
		String value = br.readLine();
		return value;
		
	}
}
