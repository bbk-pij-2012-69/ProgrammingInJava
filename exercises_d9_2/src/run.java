import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fail = 0;
		Result result = JUnitCore.runClasses(HashUtilities.class);
		
		for(Failure failure : result.getFailures())
		{
			++fail;
			System.out.println(failure.toString());
		}
		System.out.println(fail + " failures.");
	}

}
