import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;


public class InitialsTester {

	public static void main(String[] args) {
		JUnitCore.runClasses(InitialsTester.class);
	}
	
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() > 0)
			{
				String nextInitial = "" + words[i].charAt(0);
				result = result + nextInitial.toUpperCase();
			}
		}
		return result;
	}

	@Test
	public void testInitials() {
		String input = "Dereck Robert Yssirt";
		String output = getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);

		input = "Luke  Stedman";
		output = getInitials(input);
		expected = "LS";
		assertEquals(output, expected);

		input = "Pete      Axtell";
		output = getInitials(input);
		expected = "PA";
		assertEquals(output, expected);
	}
}
